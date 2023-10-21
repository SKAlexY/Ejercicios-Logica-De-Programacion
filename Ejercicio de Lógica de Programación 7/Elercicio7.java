package Ejercicios;
import java.util.Scanner;

public class MinutosHastaFinDeSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el dia de la semana
        String diaSemana;
        do {
            System.out.println("Ingresa un dia de la semana (Lunes, Martes, Miércoles, Jueves, Viernes):");
            diaSemana = scanner.nextLine();
        } while (!esDiaValido(diaSemana));

        // Solicitar la hora (horas y minutos)
        int horas;
        int minutos;
        do {
            System.out.println("Ingresa la hora (horas):");
            horas = scanner.nextInt();
            System.out.println("Ingresa la hora (minutos):");
            minutos = scanner.nextInt();
        } while (!esHoraValida(horas, minutos));

        scanner.close();

        // Calcular minutos
        int minutosFaltantes = calcularMinutosHastaFinDeSemana(diaSemana, horas, minutos);

        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
    }
    
    // Para validar que se usen los dias de la semana
    public static boolean esDiaValido(String dia) {
        return dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miercoles") ||
               dia.equalsIgnoreCase("Jueves") || dia.equalsIgnoreCase("Viernes");
    }
    
    // Comprueba que la hora sea mayor a 0 y menor a 24 al igual la hora mayor a 0 y menor a 60
    public static boolean esHoraValida(int horas, int minutos) {
        return (horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60);
    }
    
    //Calcular los minutos que faltan dependiendo del dia 
    public static int calcularMinutosHastaFinDeSemana(String dia, int horas, int minutos) {
        int minutosHastaFinDeSemana = 0;
        if (dia.equalsIgnoreCase("Lunes")) {
            minutosHastaFinDeSemana = (5 * 24 * 60) - (horas * 60 + minutos);
        } else if (dia.equalsIgnoreCase("Martes")) {
            minutosHastaFinDeSemana = (4 * 24 * 60) - (horas * 60 + minutos);
        } else if (dia.equalsIgnoreCase("Miercoles")) {
            minutosHastaFinDeSemana = (3 * 24 * 60) - (horas * 60 + minutos);
        } else if (dia.equalsIgnoreCase("Jueves")) {
            minutosHastaFinDeSemana = (2 * 24 * 60) - (horas * 60 + minutos);
        } else if (dia.equalsIgnoreCase("Viernes")) {
            if (horas < 15) {
                minutosHastaFinDeSemana = (1 * 24 * 60) - (horas * 60 + minutos);
            }
        }
        //Regresa los minutos para el fin de semana
        return minutosHastaFinDeSemana;
    }
}