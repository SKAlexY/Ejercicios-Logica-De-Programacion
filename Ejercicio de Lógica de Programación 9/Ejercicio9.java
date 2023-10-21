package Ejercicios;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        // Crear el diccionario
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("rojo", "red");
        diccionario.put("manzana", "apple");
        diccionario.put("coche", "car");
        diccionario.put("sol", "sun");
        diccionario.put("agua", "water");
        diccionario.put("amigo", "friend");
        diccionario.put("escuela", "school");
        diccionario.put("naranja", "orange");
        diccionario.put("verde", "green");
        diccionario.put("trabajo", "work");
        diccionario.put("libro", "book");
        diccionario.put("bueno", "good");
        diccionario.put("feliz", "happy");
        diccionario.put("comida", "food");
        diccionario.put("amor", "love");
        diccionario.put("cielo", "sky");
        diccionario.put("música", "music");
        diccionario.put("tiempo", "time");

        Scanner scanner = new Scanner(System.in);

        // Solicitar una palabra en español
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine().toLowerCase();

        // Buscar la traduccion
        String traduccion = diccionario.get(palabraEspañol);

        // Mostrar la traduccion
        if (traduccion != null) {
            System.out.println("La traducción al ingles es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra.");
        }
    }
}