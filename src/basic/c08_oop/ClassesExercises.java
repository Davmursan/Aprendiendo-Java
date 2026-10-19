package basic.c08_oop;

public class ClassesExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        // Creamos objeto
        Book myBook = new Book("El Quijote", "Miguel de Cervantes");
        // Asignar valores a los atributos
        //myBook.title = "El Quijote";
        //myBook.author = "Miguel de Cervantes";
        // Mostrar los datos por consola:
        System.out.println("Título: " + myBook.title);
        System.out.println("Autor: " + myBook.author);
        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        // Crear un objeto de la clase Dog
        Dog miPerro = new Dog();
        // Llamar al método bark()
        miPerro.bark();
        // 3. Añade un constructor a la clase book que reciba title y author.
        
        // 4. Crea una clase Car con atributos brand y model y un método showData().

        // 5. Crea una clase Student con atributo score y un método que diga que si aprobó (mayor o igual que 60).
        Student miNota = new Student();
        miNota.score = 75.0;
        miNota.notas();
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        // 8. Crea una clae Worker que reciba nombre y salario, y un método para mostrar su salario.
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    }
}
