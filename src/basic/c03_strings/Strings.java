package basic.c03_strings;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        String name = "Brais";
        String surname = "Moure";


        // Operaciones Básicas
        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(name.length() - 1));// Esta forma hace que sea cual sea el numero de caracteres siempre te de el último

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene algo
        System.out.println("Hola, Java".contains("Brais"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("Brais"));
        System.out.println(name.equalsIgnoreCase("brais"));

        // == vs. equals

        var a = "Brais";
        var b = "Brais";
        var c = new String("Brais");

        System.out.println(a == b);
        System.out.println(a == c); // Aquí da error pues al hacer new String() se crea un nuevo objeto y aunque contenga lo mismo lo ve diferente
        System.out.println(a.equals(c)); // Esta es la BUENA PRÁCTICA para comparar strings

        // Trim
        System.out.println("   Hola, me llamo Brais   ".trim()); // Elimina los espacios al principio y al final

        // Replace
        System.out.println("   Hola, me llamo Brais   ".replace(" ", ","));
        System.out.println("   Hola, me llamo Brais   ".trim().replace("Brais ", "David"));

        // Format

        var age = 37;
        System.out.printf(String.format("Hola,  %s. Tengo %d años", name, age)); // %s = Strings, %d = numeros int, %f = numeros decimales



    }
}
