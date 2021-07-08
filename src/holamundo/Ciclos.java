package holamundo;

public class Ciclos {
    
    public static void main(String[] args) {
        
        for (var contador1 = 0; contador1 < 3; contador1++) {
            System.out.println("contador1 = " + contador1);
        }
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
        
    }
    
}
