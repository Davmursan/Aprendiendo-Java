package basic.c5_estructuras;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Almacena un conjunto de claves-valores
        // No admite repetidos
        // Como los diccionarios
        

        // DECLARACIÓN Y CREACIÓN
        HashMap<String, String> names = new HashMap<>();// Cuando las estructuras empiezan con Hash, son desordenadas
        var numbers = new HashMap<Integer, String>();

        //Tamaño
        System.out.println(names.size());

        //Añadir Elementos 
        names.put("David", "david@gmail.com");
        names.put("Jose", "Jose@gmail.com");
        names.put("Primi", "Primi@gmail.com");
        names.put("Catu", "catu@gmail.com");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder al Elemento

        names.get("David");
        System.out.println(names.get("David"));
        System.out.println(names.get("del"));

        //Verificar Elementos

        System.out.println(names.containsKey("David"));
        System.out.println(names.containsKey("del"));

        System.out.println(names.containsValue("david@gmail.com"));
        System.out.println(names.containsValue("David@gmail.com"));

        //Eliminar Elementos

        System.out.println(names.remove("Jose"));// Cuando eliminas la clave te muestra el valor que iba asociado
        System.out.println(names);

        // Modificar Elementos
        // No existe como tal pero usando put podríamos cambiar

        names.put("David", "Deivilskiller@gmail.com");
        System.out.println(names);
        System.out.println(names.values());// Devuelve una lista con solo los valores


        //Limpiar HashMap

        names.clear();
        System.out.println(names);



    }
}
