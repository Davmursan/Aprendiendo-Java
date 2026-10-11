package basic.c5_estructuras;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class Ejercicios {
    public static void main(String[] args) {
        
        // 1. Crea un Array con 5 valores e imprime su longitud

        String[] numbers = new String[5];
        String[] names = {"david", "Ana", "Mama", "Papa", "sister"};
        System.out.println(names.length);

        // 2. Modifica uno delos valores del Array e imprime el valor del índice antes después de modificarlo
        System.out.println(names[4]);
        names[4] = "Sonia";
        System.out.println(names[4]);

        // 3. Crea un ArrayList vacío

        ArrayList<String> names2 = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación
        names2.add("Barcelona");
        names2.add("Madrid");
        names2.add("Sevilla");
        names2.add("Bilbao");
        System.out.println(names2);
        names2.remove(2);
        System.out.println(names2);

        // 5. Crea un HashSet con 2 valores diferentes

        HashSet<String> equipos = new HashSet<>();
        equipos.add("FC.Barcelona");
        equipos.add("Real de Trampas");

        System.out.println(equipos);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet
        equipos.add("Real de Trampas");
        equipos.add("Sevilla FC");
        System.out.println(equipos);

        // 7. Elimina uno de los elementos del HashSet
        equipos.remove("Real de Trampas");
        System.out.println(equipos);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade 3 contactos
        HashMap<String, Integer> users = new HashMap<>();
        users.put("David", 111111111);
        users.put("Ana", 222222222);
        users.put("Mama", 333333333);

        System.out.println(users);
        // 9. Modifica uno de los contactos y elimina otro
        users.replace("David", 123456789);
        users.remove("Ana");

        System.out.println(users);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales  
        
        String[] coches = {"Seat", "Ford", "Mercedes", "Seat"};
        ArrayList<String> listaCoches = new ArrayList<>(Arrays.asList(coches)); 
        HashSet<String> setCoches = new HashSet<>(listaCoches);
        HashMap<String, String> mapCoches = new HashMap<>();
        for (String coche : setCoches) {
            mapCoches.put(coche, coche);
        }


        System.out.println("HashMap resultante: " + mapCoches);
    }
}