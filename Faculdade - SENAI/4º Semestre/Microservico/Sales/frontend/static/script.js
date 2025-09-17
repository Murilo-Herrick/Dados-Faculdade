const API_URL = "http://localhost:5001/sales";

        async function createSale() {
            const id = document.getElementById("product_id").value;
            const amount = parseInt(document.getElementById("amount").value);
            const price = parseInt(document.getElementById("price").value);

            if (!id || !amount || !price) {
                alert("Nome, quantidade e valor são obrigatórios!");
                return;
            }

            const response = await fetch(API_URL, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ product_id, amount, price })   
            });

            const result = await response.json();
            alert(result.message || result.error);
            getSales();
        }

        async function getSales() {
            const response = await fetch(API_URL);
            const orders = await response.json();

            const tbody = document.querySelector("#salesTable tbody");
            tbody.innerHTML = "";

            orders.forEach(order => {
                const tr = document.createElement("tr");
                tr.innerHTML = `
                    <td>${order.id}</td>
                    <td>${order.name}</td>
                    <td>${order.amount}</td>
                    <td>${order.price}</td>
                `;
                tbody.appendChild(tr);
            });
        }

        getSales();