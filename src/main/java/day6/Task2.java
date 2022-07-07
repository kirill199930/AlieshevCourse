package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Fly", 2010, 3000, 1500);
        airplane.info();

        airplane.setYear(2020);
        airplane.setLength(5000);

        airplane.fillUp(1000);
        airplane.fillUp(2000);

        airplane.info();
    }
}
