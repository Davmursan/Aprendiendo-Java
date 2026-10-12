package basic.c06_loops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Loops {
    public static void main(String[] args) {
        // Loops
        // -for controlado por contador
        for (int i = 0; i < 5; i ++ ) { //++ => +1, +2 => de 2 en 2, -- => menos de 1 en 1, -2 => menos de 2 en 2
            System.out.println("Hola, Java");
        }

        String[] names = {"David", "Murcia", "Deivils"};
        for (int i = 0; i < 3; i ++) {
            System.out.println(names[i]);
        }

        String[] names1 = {"David", "Murcia", "Deivils"}; // Aquí te aseguras que recorre el Array entero
        for (int i = 0; i < names1.length; i ++) {
            System.out.println(names1[i]);
        }
        
        // - for-each (para cada uno de los elementos, el mejor para la list, array)
        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number );
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("David", "david@gmail.com");
        emails.put("Jose", "Jose@gmail.com");
        emails.put("Primi", "Primi@gmail.com");
        emails.put("Catu", "catu@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        //- while / do while
        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!!!!!");
            index ++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index ++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("David")){
                find = true;
            }
            index ++;
        }

        // - do-while
        index = 0;
        do {
            System.out.println("Hola, Java!!!");
            index ++;
        }while(index < 5);

        // Control de bucles

        // - break

        for (String name: names) {
            if (name.equals("Murcia")){
                break;
            }
            System.out.println(name);
        }

        // - continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // Ejercicios Bucles
        // 1. Imprime los números del 1 al 10 usando while
        int count = 1;
        while (count < 11) {
            System.out.println(count);
            count ++;
            
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList
        ArrayList<String> name = new ArrayList<>();
        name.add("David");
        name.add("Murcia");
        name.add("Deivils");

        int x = 0;
        do {
            System.out.println(name);
            x ++;
        } while (x < 1);

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for
        for (int i = 5; i <= 50; i+=5) {
            System.out.println(i);
        }
        // 4. Recorre un Array de 5 números e imprime la suma total

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println("La suma total es: " + suma);
        // 5. Usa un for para recorrer un Array y mostrar sus valores
        
        for(int i: numeros ){
            System.out.println(i);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap
        // 7. Imprime los números de 10 al 1 con un con un bucle for
        
        for (int num1 = 10; num1 >=1; num1 --){
            System.out.println(num1);
        }
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20
        for (int i = 0; i <= 20; i ++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
        // 9. Usa break para deterner un bucle cuando encuentres un número negativo en un array
        int numeros1[] = new int[7];
        numeros1[0] = 1;
        numeros1[1] = 2;
        numeros1[2] = 3;
        numeros1[3] = -3;
        numeros1[4] = 4;
        numeros1[5] = 5;
        numeros1[6] = -6;
        for (int i = 0; i < numeros1.length; i ++){
            if (numeros1[i] < 0){
                break;
            }
            System.out.println(i);
        }
        // 10. Crea un programa que calcule el factorial de un número dado


    }
}
