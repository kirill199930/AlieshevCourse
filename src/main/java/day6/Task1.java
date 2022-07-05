package day6;

public class Task1 {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setYear(2022);
        audi.info();
        System.out.println(audi.getYear());
        System.out.println(audi.yearDifference(2000));

        Motorbike motorbike = new Motorbike("Grey","b2",2018);
        motorbike.info();
        System.out.println(motorbike.getYear());
        System.out.println(motorbike.yearDifference(2010));
    }
}
