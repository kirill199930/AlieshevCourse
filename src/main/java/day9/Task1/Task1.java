package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Alex");
        human.printInfo();

        Student student = new Student( "Kirill", "topTeam");
        student.getGroupName();
        student.printInfo();

        Teacher teacher = new Teacher("Petr","Math");
        System.out.println(teacher.getNameObject());
        teacher.printInfo();


    }
}
