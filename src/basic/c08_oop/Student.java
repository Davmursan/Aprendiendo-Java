package basic.c08_oop;

public class Student {
    double score;

    public void notas(){
        if (score >= 60){
            System.out.println("Has aprobado");
        }else{
            System.out.println("Has suspendido");
        }
    }
}
