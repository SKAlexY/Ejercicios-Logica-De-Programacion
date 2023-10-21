package Ejercicios;
import java.util.Scanner;

public class InvertirTexto {

    public static void main(String[] args) {
        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar una frase
        System.out.println("Ingresa una palabra o frase:");
        String texto = scanner.nextLine();

        scanner.close();

        // Llamar a la función para invertir el texto y luego imprime el resultado
        String textoInvertido = invertirTexto(texto);
        System.out.println(textoInvertido);
    }

    // Función que invierte el texro
    public static String invertirTexto(String texto) {
        StringBuilder textoInvertido = new StringBuilder(texto);
        return textoInvertido.reverse().toString();
    }
}