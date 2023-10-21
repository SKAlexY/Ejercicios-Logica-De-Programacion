// Los siguientes prompt son para pedirle al usuario ingresar los numeros 
const numero1 = parseFloat(prompt("Ingrese el primer numero:"));
const numero2 = parseFloat(prompt("Ingrese el segundo numero:"));
const numero3 = parseFloat(prompt("Ingrese el tercer numero:"));

if (!isNaN(numero1) && !isNaN(numero2) && !isNaN(numero3)) {

  // mayor a menor
  const numerosDesc = [numero1, numero2, numero3].sort((a, b) => b - a);

  // menor a mayor
  const numerosAsc = [numero1, numero2, numero3].sort((a, b) => a - b);

  // Comprobar los numeros
  const sonIguales = numero1 === numero2 && numero2 === numero3;

  // Mostrar los numeros de mayor a menor
  console.log("mayor a menor:", numerosDesc);

  // Mostrar los numeros de menor a mayor 
  console.log("menor a mayor:", numerosAsc);

  if (sonIguales) {
    console.log("Los numeros son iguales.");
  }
} else {
  console.log("Por favor, ingrese numeros validos.");
}