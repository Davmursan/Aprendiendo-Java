package basic.c5_estructuras;

public class Arrays {
    public static void main(String[] args) {

        // Arrays, datos almacenados con un índice
        // DECLARACIÓN Y CREACIÓN

        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"David", "Murcia", "Deivils"};
        System.out.println(names);

        // Acceso
        System.out.println(numbers[2]); // Muestra un 0 ya que no le hemos metido valores, digamos que hemos reservado 3 espacios
        System.out.println(names[0]);

        System.out.println((new String[3])[0]); // Cuando se hace con String devuelve null

        // Modificación

        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[3] = 2; Esto da error porque solo habiamos reservado hasta la posición 2

        System.out.println(names[2]);
        names[2] = "deivils@gmail.com";
        System.out.println(names[2]);

        names[2] = null; // En los arrays no hay eliminación como tal, pasar datos a null es una manera pero no cambia la longitud
        System.out.println(names.length);

        //numbers[2] = null; // Con los numeros(datos primitivos) esta opción da error


        

    }
}

