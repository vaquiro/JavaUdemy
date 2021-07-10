package holamundo;

public class TiposVariables {

    public static void main(String[] args) {
        //Definir variable entera
        int miVariableEntera = 10;
        System.out.println("miVariableEntera = " + miVariableEntera);
        miVariableEntera = 5;
        System.out.println("miVariableEntera = " + miVariableEntera);

        //Definir variable cadena
        String miVariableCadena = "Saludos";
        System.out.println("miVariableCadena = " + miVariableCadena);
        miVariableCadena = "Adiós";
        System.out.println("miVariableCadena = " + miVariableCadena);

        //Inferencia de tipos en java
        var miVariableEntera2 = 1;
        var miVariableCadena2 = "Salu2";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores permitidos
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var ámiVariable = 4;
        
        
        
        
        //Restricciones
      //  var 1miVariable = 1;
        //var #miVariable = 2;

    }

}
