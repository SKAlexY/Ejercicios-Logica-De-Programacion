// Función para verificar si un valor es un numero
function esNumero(valor) {
    return !isNaN(parseFloat(valor)) && isFinite(valor);
}

// Solicitar numero
let numero;

do {
    numero = prompt("Ingresa un numero para calcular su factorial:");
    if (!esNumero(numero)) {
        alert("Por favor, ingresa un numero valido.");
    }
} while (!esNumero(numero));

// Convertir el valor a número
numero = parseFloat(numero);

// Calcular el factorial del número
function calcular(numero) {
    if (numero === 0 || numero === 1) {
        return 1;
    } else {
        return numero * calcular(numero - 1);
    }
}

const factorial = calcular(numero);

// Mostrar el factorial en la consola
console.log(factorial);