package poo;

public class MassaCorporal {
	private double peso;
	private double altura;
	private String classificacao;
	private double agua;
	private int idade;
	
	// Setter e Getters
	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getClassificacao() {
		return this.classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public double getAgua() {
		return agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//metodos
	public double imc() {
		return this.peso / (this.altura * this.altura);
	}
	
	public String categoria(double imc) {
		
		if(imc <= 16.9) this.classificacao =  "Muito abaixo de peso";
		if(imc > 17 && imc <= 18.4 ) this.classificacao =  "Abaixo do peso";
		if(imc > 18.5 && imc <= 24.9) this.classificacao =  "Peso normal";
		if(imc > 25 && imc <= 29.9) this.classificacao =  "Acima do pesso";
		if(imc > 30 && imc <= 34.9) this.classificacao =  "Obesidade grau 1";
		if(imc > 35 && imc <= 40) this.classificacao =  "Obesidade grau 2";
		if(imc > 40) this.classificacao =  "Obesidade grau 3";
		
		return this.classificacao;
	}
	
	public String preescricaoMedica(String diagnostico) {
		
		switch(diagnostico){
		case "Muito abaixo de peso" : 
			diagnostico = "Comer mais";
			break;
			
		case "Abaixo do peso": 
			diagnostico = "Comer um pouco mais";
			break;
		
		case "Peso normal": 
			diagnostico = "Continue assim :)";
			break;
		
		case "Acima do pesso":
			diagnostico = "Comer um pouco menos";
			break;
			
		case "Obesidade grau 1":
			diagnostico = "Comer menos";
			break;
			
		case "Obesidade grau 2":
			diagnostico = "Comer muito menos";
			break;
		
		case "Obesidade grau 3":
			diagnostico = "Comer muito muito menos";
			break;
		}
		
		return diagnostico;	
	}
	public double litrosAgua () {
		if (this.idade <= 17) this.agua = this.peso * 0.40;
		if (this.idade > 17 && this.idade <= 55) this.agua = this.peso * 0.35;
		if (this.idade > 55 && this.idade <= 65) this.agua = this.peso * 0.30;
		if (this.idade > 66) this.agua = this.peso * 0.25;
		return this.agua;
	}
}
