
package el.primer.programa.en.java;

import java.util.Scanner;

public class Miprimerprogramaenjava {
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
            System.out.print("De el nombre del Estudiante ");
            Estudiantes[i] = Teclado.next();
            System.out.print("De el Apellido del Estudiante ");
            Estudiantes[i] = Teclado.next();
            System.out.print("coloque la Cedula del Estudiante ");
            Estudiantes[i] = Teclado.next();
            System.out.print("Ingrese la Edad del Estudiante ");
            Estudiantes[i] = Teclado.next();
            System.out.print("Ingrese la calificacion ");
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
        System.out.printf("%-30s %-30s%n%n", "Estudiantes", "Calificacion");
        for (int i = 0; i < Calificaciones.length; i++)
        {
            System.out.printf("%-30s %-30f%n", Estudiantes[i], Calificaciones[i]);
        }
        System.out.println("\nEl promedio grupal es "+Promedio);
    }
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        double Calificaciones[];
        String Alumnos[];
        int n;
        double Promedio;
        
        System.out.print("Ingrese el numero de Estudiantes ");
        n = Teclado.nextInt();
        
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