package Ejercicios;
import java.util.HashMap;
import java.util.Scanner;

public class PruebaDiccionario {

    public static void main(String[] args) {
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
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Por favor, traduce las siguientes palabras al ingles:");

        //Comprueba las respuestas correctas e incorrectas y el resultado se suma a positivas o negativas
        for (int i = 0; i < 5; i++) {
            String palabraEspañol = seleccionarPalabraAleatoria(diccionario);
            String traduccionCorrecta = diccionario.get(palabraEspañol);

            System.out.print("Traduce " + palabraEspañol + ": ");
            String traduccionUsuario = scanner.nextLine();

            if (traduccionCorrecta.equalsIgnoreCase(traduccionUsuario)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    //Selecciona una palabra random
    public static String seleccionarPalabraAleatoria(HashMap<String, String> diccionario) {
        int indiceAleatorio = (int) (Math.random() * diccionario.size());
        int contador = 0;
        for (String palabra : diccionario.keySet()) {
            if (contador == indiceAleatorio) {
                return palabra;
            }
            contador++;
        }
        return null;
    }
}