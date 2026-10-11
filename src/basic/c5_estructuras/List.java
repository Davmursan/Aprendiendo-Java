package basic.c5_estructuras;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        // El arrayList es más fexible que el array puro
        // DECLARACIÓN Y CREACIÓN
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño
        
        System.out.println(names.size());

        // Añadir Elementos
        names.add("David");
        names.add("Murcia");
        names.add("Deivils");
        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.get(0));
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar los elementos

        names.set(2,"Deivils@gmail.com");
        System.out.println(names.getLast());

        // Eliminar Elementos

        names.remove(2);
        //System.out.println(names.get(2)); Esto da error ya que al eliminar la posición 2 ahora excedemos del numero de elementos
        System.out.println(names.size());

        // Buscar Elementos

        System.out.println(names.contains("David"));
        System.out.println(names.contains("Deivils@gmail.com"));

        // Limpiar ArrayList

        //names.clear();
        //System.out.println(names.size());

        // PRUEBAS DE FUNCIONES CON ARRAYLIST

        names.addFirst("Barcelona");
        names.addLast("New York");
        names.equals(numbers);//Este funciona cuando lo imprimo directamente
        names.reversed();// Este funciona cuando lo imprimo directamente
        
        System.out.println(names);

    }
}
