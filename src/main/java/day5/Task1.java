package day5;

public class Task1 {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setYear(2022);
        audi.setModel("A8");
        audi.setColor("Black");
        System.out.println(audi.getYear() + " " + audi.getModel() + " " + audi.getColor());
    }
}
