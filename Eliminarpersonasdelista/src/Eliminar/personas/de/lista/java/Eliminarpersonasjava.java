 
package Eliminar.personas.de.lista.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eliminarpersonasjava {
//Autor @Kleyber Perez
    private static String Estudiantes;
    
    /**
     *
     * @param Calificaciones
     * @param Estudiantes
     * @param Apellido
     * @param Cedula
     * @param Edad
     * @param Teclado
     */
    public static void Inicializar(double Calificaciones[], String Estudiantes[], String Apellido[], String Cedula, String Edad, Scanner Teclado)
    {
        for (int i = 0; i < Calificaciones.length; i++)
        {
            System.out.print("Nombre: ");
            Estudiantes[i] = Teclado.next();
            System.out.print("Apellido ");
            Estudiantes[i] = Teclado.next();
            System.out.print("Cedula ");
            Estudiantes[i] = Teclado.next();
            System.out.print("Edad ");
            Estudiantes[i] = Teclado.next();
            System.out.print("calificacion ");
            Calificaciones[i] = Teclado.nextDouble();
        }
    }
    
    public static double Promedio(double Calificaciones[])
    {
        double prom, suma = 0;
        for (int i = 0; i < Calificaciones.length; i++)
            suma += Calificaciones[i];
        prom = suma / Calificaciones.length;
        return prom;
    }
    
    public static void Imprimir(double Calificaciones[], String Estudiantes[], double Promedio)
    {
        System.out.printf("%-30s %-30s%n%n", "Datos","de los Estudiantes");
        for (int i = 0; i < Calificaciones.length; i++)
        {
           System.out.printf("%-30s %-30f%n", Estudiantes[i], Calificaciones[i]);
        }
        System.out.println("Nombre y Apellido: Kleyber Perez C.I: 27605760 Edad: 21"+Promedio);
        System.out.println("Nombre y Apellido: Pierina Zacarias C.I: 29879324 Edad: 19"+Promedio);
        System.out.println("Nombre y Apellido: Gabriela Perez C.I: 19755340 Edad: 32"+Promedio);
        System.out.println("Nombre y Apellido: Levi Romero C.I: 29604890 Edad: 21"+Promedio);
        System.out.println("Nombre y Apellido: Jose Salazar C.I: 2771998960 Edad: 21"+Promedio);
        System.out.println(Promedio+"Eliminar datos del estudiante ingresando el numero de cedula");
    }
    /*objectA.removeIf(x -> blockedWorkerIds.contains(x));*/

List<String> str1 = new ArrayList<>();{
str1.add("A");
str1.add("B");
str1.add("C");
str1.add("D");

List<String> str2 = new ArrayList<>();
str2.add("D");
str2.add("E");

str1.removeIf(x -> str2.contains(x)); 

str1.forEach(System.out::println);
}
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        double Calificaciones[];
        String Alumnos[];
        int n = 0;
        double Promedio;
        
        System.out.print("Coloque el numero de los estudiantes 5: ");
        int Cedula;
        Cedula = Teclado.nextInt();
        
        Calificaciones = new double[n];
        Alumnos = new String[n];
        String[] Apellido = null;
        String cedula = null;
        String edad = null;
        
        Inicializar(Calificaciones, Alumnos, Apellido, cedula, edad, Teclado);
        Promedio = Promedio(Calificaciones);
        Imprimir(Calificaciones, Alumnos, Promedio);
    }   
}