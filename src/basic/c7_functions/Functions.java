package basic.c7_functions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Functions
 */
public class Functions {
    public static void main(String[] args) {
        
        // Funciones, bloque de código que tiende a repetirse

        for (int index = 0; index < 5; index++){
            sendEmail();

            sendEmailToUser("david@gmail.com");
            sendEmailToUser("david@gmail", "David");

            var users = new ArrayList<>(Arrays.asList("David@hotmail.com", "Murcia@gmail.com", "Deivilskiller@gmail.com"));
            sendEmailToUser(users);

            var state = sendEmailWithState("david@gmail.com");
            System.out.println(state);

            System.out.println(sendEmailWithState(""));
        }

        // Cómo se crean las funciones
        

    
    }
    // Función sin parámetros ni retorno

    public static void sendEmail () {
        System.out.println("Se envía el email");
    }

    // Función con parámetros 

    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

    // sobrecarga de funciones
    
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails)
        System.out.println("Se envía el email a " + email);
    }

    // Funciones con retorno

    public static boolean sendEmailWithState(String email) {
        if (email.isEmpty()) {
            return false;
        }
        System.out.println("Se envía el email a " + email);
        return true;
    }
}
