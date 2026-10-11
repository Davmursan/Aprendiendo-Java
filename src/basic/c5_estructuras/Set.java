package basic.c5_estructuras;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        
        // En los Sets no se puede variar lo que introduzcas
        // El set es una estructura desordenada
        // No permite repetidos

        // DECLARACIÓN Y CREACIÓN

        HashSet<String> names = new HashSet<>();// Cuando las estructuras empiezan con Hash, son desordenadas
        var numbers = new HashSet<Integer>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos

        names.add("David");
        names.add("Murcia");
        names.add("Deivils");
        System.out.println(names.size());

        System.out.println(names);

        //Eliminar Elementos
        names.remove("David");

        // Buscar Elementos
        System.out.println(names.contains("David"));
        System.out.println(names.contains("David@gmail.com"));

        System.out.println(names);
        names.add("Murcia"); // No lo añade
        System.out.println(names);

        // Conjuntos

        //names.addAll(numbers); // Es un error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");

        names.addAll(countries);
        System.out.println(names);

        //names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);



    }
}
