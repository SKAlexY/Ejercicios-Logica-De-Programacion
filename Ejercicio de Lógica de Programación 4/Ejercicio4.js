        function esNumero(valor) {
            return !isNaN(parseFloat(valor)) && isFinite(valor);
        }

        // Solicitar un numero
        let numero;

        do {
            numero = prompt("Ingresa un numero para mostrar la serie de fibonacci:");
            if (!esNumero(numero)) {
                alert("Por favor, ingresa un numero valido.");
            }
        } while (!esNumero(numero));

        // Convertir el valor a numero
        numero = parseInt(numero);

        // Calcular la serie de Fibonacci
        function calcular(n) {
            const fibonacci = [0, 1];
            for (let i = 2; i < n; i++) {
                const a = fibonacci[i - 1];
                const b = fibonacci[i - 2];
                fibonacci.push(a + b);
            }
            return fibonacci;
        }

        const serieFibonacci = calcular(numero);

        console.log(serieFibonacci.join(", "));