package basic.c08_oop;

public class Classes {
    public static void main(String[] args) {
        var person = new Person("David", 46);

    //    person.name = "David";
    //    person.age = 46;

        person.sayHello();

        person.name = "David Murcia";

        System.out.println(person.name);

        var person2 = new Person("mouredev", 18);
        person2.sayHello();
    }
}


