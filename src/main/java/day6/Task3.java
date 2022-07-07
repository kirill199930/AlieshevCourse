package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Kirill","Math");
        Student student = new Student("Alex");
        teacher.evaluate(student,0);
        //teacher.evaluate(student,2);
        //teacher.evaluate(student,3);
        //teacher.evaluate(student,4);
        //teacher.evaluate(student,5);

        Teacher teacher1 = new Teacher("Kirill","Math");
        teacher1.evaluate(student,2);


    }
}
