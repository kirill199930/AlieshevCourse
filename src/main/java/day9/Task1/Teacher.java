package day9.Task1;

public class Teacher extends Human{

    private String nameObject;

    public Teacher(String name, String nameObject) {
        super(name);
        this.nameObject = nameObject;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }


    public String getSubjectName() {
        System.out.println("Метод getSubject() вызван у обекта класса Teacher, с полем subjectName " + nameObject);
        return nameObject;
    }
}
