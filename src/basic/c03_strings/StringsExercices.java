package basic.c03_strings;

import javax.swing.plaf.synth.SynthPopupMenuUI;

public class StringsExercices {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        System.out.println("Hola" + " Mundo");

        // 2. Muestra la logitud de una cadena de texto.

        String cadena = "Hola me llamo David";
        System.out.println(cadena.length());

        // 3. Muestra el primer y  último carácter de un string.

        String name = "David";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        String name1 = "felicidad";
        String name2 = "BONITO";
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra.
        System.out.println(name1.contains("ci"));

        // 6. Formatea un string con un entero.
        int age = 46;
        System.out.printf("Hola me llamo %s soy pura %s y tengo %d años.\n", name, name1, age);

        // 7. Elimina los espacios en blanco al principio y al final.
        String cadena2 = "    En un lugar de la mancha, de cuyo nombre no me quiero acordar...        ";
        System.out.println(cadena2.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión.
        System.out.println(cadena2.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(name1));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name.length() == name1.length());
    }

}
