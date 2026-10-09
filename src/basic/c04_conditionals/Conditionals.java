package basic.c04_conditionals;

public class Conditionals {
    public static void main(String[] args) {

        // Condicionales

        var age = 16;

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        }else if (age == 18){
            System.out.println("El usuario acaba de cumplir 18");

        }else {
            System.out.println("El usuario es menor de edad");
        }
        
        // Sentencia switch

        var day = 7;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                System.out.println("Número no válido!! Ingrese un número del 1 al 7");
        }
        

        // Ejercicios Condicionales 
        // 1. Establece la edad de usuario de un usuario y muestra si puede votar
        int age1 = 18;

        if (age1 >= 18){
            System.out.println("Eres mayor de edad y puedes votar.");
        }else{
            System.out.println("Eres menor de edad y no puedes votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        var num1 = 20;
        var num2 = 20;

        if (num1 > num2){
            System.out.println("El numero 1 es mayor");
        }else if(num1 == num2){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("El número 2 es mayor");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        var num3 = -10;
        if(num3 > 0){
            System.out.println("El número es positivo");
        }else if(num3 == 0){
            System.out.println("El número es 0");
        }else{
            System.out.println("El número es negativo");
        }

        // 4. Crea un programa que diga si un número es par o impar
        var num4 = 3;
        if(num4 % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100
        num4 = 150;
        if(num4 > 0 && num4 < 100){
            System.out.println("El número está entre el 1 y el 100");
        }else{
            System.out.println("El número no está entre el 1 y el 100");
        }

        // 6. Declara una variable con el nombe del mes (1-12) y muestra su nombre con switch
        var mes = 4;
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        
            default:
                System.out.println("El número tiene que ser del 1 al 12.");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100)
        var nota = 90;
        if(nota > 0 && nota < 50){
            System.out.println("Suspenso");
        }else if(nota >= 50 && nota < 90){
            System.out.println("Aprobado");
        }else{
            System.out.println("Sobresaliente");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado
        var ageUserKid = 18;
        var companion = false;

        if (ageUserKid >= 15 || companion == true){
            System.out.println("Puedes entrar al cine");
        }else if (ageUserKid < 15 || companion == false)
            System.out.println("No puedes entrar al no ir acompañado/a");

        // 9. Crea un programa que diga si una letra es vocal o consonante (char)

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        char miLetra = '6'; // La letra que queremos comprobar
        boolean esVocal = false;

        //recorremos el array para ver si miLetra coincide con alguna vocal
        for (char v : vocales){
            if (miLetra == v){
                esVocal = true;
                break; // Si ya la encontramos, salimos del bucle
            }
        }

        if (esVocal){
            System.out.println("Es una vocal");
        }else {
            System.out.println("Es una consonante.");
        }

        // 10. Usa tres variables a, b y c y muestra cuál es el mayor de las tres 
        var a = 35;
        var b = 40;
        var c = 10;

        if (a >= b && a >= c){
            System.out.println("El mayor es a: " + a);
        }else if(b >= a && b >= c){
            System.out.println("El mayor es b: " + b);
        }else{
            System.out.println("El mayor es c: " + c);
        }




    }





}
