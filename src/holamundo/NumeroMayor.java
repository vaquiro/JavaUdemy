package holamundo;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        int numeroMayor;
        if (numero1 > numero2) {
            numeroMayor = numero1;
        } else {
            numeroMayor = numero2;
        }
        System.out.println("El numero mayor es: " + numeroMayor);
        
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);

    }

}
