package basic.c7_functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class FunctionsExercices {
    public static void main(String[] args) {
        // 1. Crea una función que imprima "Te doy la bienvenida al curso Java desde cero"
        saludo();

        // 2. Crea una función que reciba un nombre como parámetro y salude a esa persona
        saludo_personal("David");

        // 3. Crea una función que reciba dos número enteros y devuelva su resta
        int resultado = resta(5,3);
        System.out.println(resultado);

        // 4. Crea un método que calcule el cuadrado de un número
        resultado = cuadrado(4);
        System.out.println(resultado);

        // 5. Escribe una función que reciba un número y diga si es par o impar
        par_Impar(5);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad y false si no lo es
        System.out.println(edad(10));

        // 7. Implementa una función que reciba una cadena y retorne su longitud
        cadena("Esto es una cadena de texto");

        // 8. Crea un método que reciba un array de enteros, calcula la media y lo retorna
        int[] misNumeros = {5, 10, 15, 20};
        double resul = media(misNumeros);
        System.out.println("La media es: " + resul);

        // 9. Escribe un método que reciba un número y retorna su factorial


        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento
        var elements = new ArrayList<>(Arrays.asList("agua", "fuego", "aire", "tierra"));
        elementos(elements);
        

    }

    public static void saludo() {
        System.out.println("Te doy la bienbenida al curso de Java desde cero");
    }

    public static void saludo_personal(String name){
        System.out.println("Hola " + name + " bienvenido a Java!!");

    }

    public static int resta(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public static int cuadrado(Integer num1){
        return num1 * num1;
    }

    public static void par_Impar(Integer num1){
        
        if (num1 % 2 == 0){
            System.out.println("El número " + num1 + " es par" );
        }else{
            System.out.println("El número " + num1 + " es impar" );
        }
    }

    public static boolean edad(Integer num1){
        if (num1 >= 18){
            return true;
        }else{
            return false;
        }
    }

    public static void cadena(String frase){
        System.out.println(frase.length());
    }

    public static double media(int[] numeros){
        if (numeros == null || numeros.length == 0) {
            return 0.0;
        }
        double suma = 0;
        for (int num : numeros){
            suma += num;
        }
        return suma / numeros.length;
    }

    public static void elementos(ArrayList<String> recorridos){
        for ( String recorrido: recorridos) {
            System.out.println(recorrido);
        }
    }
}
