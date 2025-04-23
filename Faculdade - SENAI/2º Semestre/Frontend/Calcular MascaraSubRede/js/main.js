// Função para calcular sub-redes
function calculateSubnets() {
    // Obtém o valor do endereço de IP e da quantidade de sub-redes fornecidos pelo usuário
    const ipAddress = document.getElementById("ipAddress").value;
    const subnetCount = parseInt(document.getElementById("subnetCount").value);

    if (!validateIpAddress(ipAddress) || isNaN(subnetCount) || subnetCount <= 0) {
        // Exibe no campo de resultado se o IP for inválido ou o número de redes for inválido ou menor ou igual a zero
        document.getElementById("errorMessege").innerHTML = "Por favor, insira um IP válido e uma quantidade de sub-redes maior que zero.";
        document.getElementById("errorMessege").style.color = "red";
        return;
    }

    // Solicita ao usuário a máscara de sub-rede inicial no formato CIDR (ex: /24)
    const initialMaskBits = parseInt(prompt("Digite a máscara inicial (ex: 24 para /24):"));

    // Verifica se a máscara inicial é válida (entre 8 e 30 bits)
    if (isNaN(initialMaskBits) || initialMaskBits < 8 || initialMaskBits > 30) {
        // Exibe no campo de resultado se a máscara não estiver no intervalo válido
        document.getElementById("errorMessege").innerHTML = "Por favor, insira uma máscara inicial válida (entre 8 e 30).";
        document.getElementById("errorMessege").style.color = "red";
        return;
    }

    // Calcula a quantidade de bits extras necessários para suportar o número desejado de sub-redes
    const bitsRequired = Math.ceil(Math.log2(subnetCount));

    // Calcula a nova máscara de sub-rede somando os bits adicionais à máscara inicial
    const newMaskBits = initialMaskBits + bitsRequired;

    // Verifica se a nova máscara excede o número máximo permitido de 32 bits
    if (newMaskBits > 32) {
        // Exibe no campo de resultado se a quantidade de sub-redes for muito grande para a máscara inicial
        document.getElementById("errorMessege").innerHTML = "A quantidade de sub-redes desejada é muito grande para ser suportada pela máscara inicial.";
        document.getElementById("errorMessege").style.color = "red";
        return;
    }

    // Converte o novo número de bits da máscara para a notação decimal de máscara de sub-rede
    const subnetMask = convertCIDRTosubnetMask(newMaskBits);

    // Calcula o número de hosts disponíveis por sub-rede (2^bitsForHosts - 2)
    const bitsForHosts = 32 - newMaskBits; // Bits restantes para hosts
    const hostPerSubnet = Math.pow(2, bitsForHosts) - 2; // Subtrai 2 para a rede e o endereço de broadcast

    // Exibe os resultados na página
    document.getElementById("subnetMask").innerText = `Nova máscara de sub-rede: ${subnetMask} (/${newMaskBits})`;
    document.getElementById("subnetMask").style.color = "green";
    document.getElementById("hostsPerSubnet").innerText = `Hosts por sub-rede: ${hostPerSubnet}`;
    document.getElementById("hostsPerSubnet").style.color = "green";
}

// Função que valida o endereço de IP com uma expressão regular
function validateIpAddress(ip) {
    // Expressão regular para verificar se o IP está no formato correto
    const regex = /^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/;
    return regex.test(ip); // Retorna verdadeiro se o IP corresponder ao padrão
}

// Função que converte a máscara CIDR para a máscara de sub-rede decimal
function convertCIDRTosubnetMask(maskBits) {
    let mask = []; // Array para armazenar os quatro octetos da máscara
    for (let i = 0; i < 4; i++) {
        // Calcula quantos bits são usados no octeto atual
        const bits = Math.min(maskBits, 8);
        maskBits -= bits; // Reduz o número de bits restantes
        // Calcula o valor decimal do octeto e adiciona à máscara
        mask.push(256 - Math.pow(2, 8 - bits));
    }
    return mask.join('.'); // Junta os octetos para formar a máscara de sub-rede em formato decimal
}