const API_URL = "http://localhost:5000/products";

        async function createOrder() {
            const name = document.getElementById("name").value;
            const amount = parseInt(document.getElementById("amount").value);

            if (!name || !amount) {
                alert("Nome e quantidade são obrigatórios!");
                return;
            }

            const response = await fetch(API_URL, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ name, amount })
            });

            const result = await response.json();
            alert(result.message || result.error);
            getOrders();
        }

        async function getOrders() {
            const response = await fetch(API_URL);
            const orders = await response.json();

            const tbody = document.querySelector("#ordersTable tbody");
            tbody.innerHTML = "";

            orders.forEach(order => {
                const tr = document.createElement("tr");
                tr.innerHTML = `
                    <td>${order.id}</td>
                    <td>${order.name}</td>
                    <td>${order.amount}</td>
                `;
                tbody.appendChild(tr);
            });
        }

        getOrders();