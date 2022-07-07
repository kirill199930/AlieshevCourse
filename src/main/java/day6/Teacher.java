package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String book;

    public Teacher(String name, String book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }


    public void evaluate(Student student, int rand) {
        Random random = new Random();
        //rand = 0;
        rand = random.nextInt(6);

        if (rand == 5) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                    " по предмету " + book + " на оценку " + "отлично.");
        } else if (rand == 4) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                    " по предмету " + book + " на оценку " + "хорошо.");
        } else if (rand == 3) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                    " по предмету " + book + " на оценку " + "удовлетворительно.");
        } else if (rand == 2) {
            System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                    " по предмету " + book + " на оценку " + "неудовлетворительно.");
        } else  {
            System.out.println("Неправильная оценка");
        }


//
//        String evul = " ";
//        switch (rand) {
//            case 2:
//                evul = "неудовлетворительно";
//                break;
//            case 3:
//                evul = "удовлетворительно";
//                break;
//            case 4:
//                evul = "хорошо";
//                break;
//            case 5:
//                evul = "отлично";
//                break;
//            case 0:
//                evul = "Оценка 0";
//        }
//
//        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
//                " по предмету " + book + " на оценку " + evul + ".");

    }
}


//  "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
//по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."