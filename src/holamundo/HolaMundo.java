package holamundo;

public class HolaMundo {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //Variables
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Valentina";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        //Con var, es posible inferir el valor de la variable que se envía
        var miVariableEntera2 = 20;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }
    
}
