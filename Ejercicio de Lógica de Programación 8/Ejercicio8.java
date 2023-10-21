package Ejercicios;
import java.util.Scanner;

public class OrdenarPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] numerosPrimos = new int[10];
        int[] otrosNumeros = new int[10];
        int contadorPrimos = 0;
        int contadorOtros = 0;

        // Solicitar 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();

            if (esPrimo(numeros[i])) {
                numerosPrimos[contadorPrimos] = numeros[i];
                contadorPrimos++;
            } else {
                otrosNumeros[contadorOtros] = numeros[i];
                contadorOtros++;
            }
        }

        // Mostrar los numeros
        System.out.println("Numeros en el orden original:");
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }

        // Mostrar los numeros primos
        System.out.println("Array ordenado con primos al inicio:");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println("pos[" + i + "] = " + numerosPrimos[i]);
        }
        for (int i = 0; i < contadorOtros; i++) {
            System.out.println("pos[" + (i + contadorPrimos) + "] = " + otrosNumeros[i]);
        }
    }

    // Numeros primos
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}