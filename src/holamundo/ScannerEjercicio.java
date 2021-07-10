package holamundo;

import java.util.Scanner;

public class ScannerEjercicio {

    public static void main(String[] args) {
        //Ejercicio 1
        var nombre = "Carlos";
        System.out.println("Nombre = " + nombre);
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = consola.nextLine();

        System.out.println("Nombre = " + nombre);

        //Ejercicio 2 
        System.out.println("Proporciona el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println("El libro " + titulo + "\nFue escrito por " + autor);
    }
}
