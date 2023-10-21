let convertirTemperatura;
//Pide al usuario ingresar un numero valido, si este no es valido se reiniciara hasta que suceda 
do {
    convertirTemperatura = prompt("Ingresa la temperatura en grados Celsius:");
    if (typeof parseFloat(convertirTemperatura) !== 'number') {
        alert("Por favor, ingresa un numero válido.");
    }
} while (typeof parseFloat(convertirTemperatura) !== 'number');

// Convertir la temperatura
const celsius = parseFloat(convertirTemperatura);
const fahrenheit = (celsius * 9/5) + 32;
const kelvin = celsius + 273.15;

// Mostrar los resultados
console.log("Grados fahrenheit:", fahrenheit);
console.log("Grados kelvin:", kelvin);
