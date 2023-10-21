        function esNumero(valor) {
            return !isNaN(parseFloat(valor)) && isFinite(valor);
        }

        // Numero entre el 1 y el 100
        const numeroSecreto = Math.floor(Math.random() * 100) + 1;

        const intentos = [];

        let adivinado = false;

        while (!adivinado) {
            // Solicitar numero
            let numeroIngresado;

            do {
                numeroIngresado = prompt("Adivina el numero entre el 1 y el 100:");
                if (!esNumero(numeroIngresado)) {
                    alert("Por favor, ingresa un número valido.");
                }
            } while (!esNumero(numeroIngresado));

            numeroIngresado = parseInt(numeroIngresado);
            intentos.push(numeroIngresado);

            // Comprobar si el numero es el mismo
            if (numeroIngresado === numeroSecreto) {
                adivinado = true;
                console.log("Felicidades, adivinaste el numero secreto.");
            } else {
                console.log("El numero secreto es incorrecto, vuelve a intentarlo.");
            }
        }

        // Mostrar los numeros
        console.log("Numeros introducidos: " + intentos.join(", "));