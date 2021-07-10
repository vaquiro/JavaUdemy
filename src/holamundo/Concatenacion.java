package holamundo;

public class Concatenacion {

    public static void main(String[] args) {
        var usuario = "Pedro";
        var titulo = "Ingeniero";

        //Operador +
        var union = titulo + usuario;
        System.out.println("union = " + union);
        //Adjuntar caracter para separar cadenas
        union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 1;
        var j = 3;

        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));

    }
}
