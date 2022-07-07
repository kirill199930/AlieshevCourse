package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("2",3,200,200);
        Airplane airplane1 = new Airplane("4",5,300,500);


        Airplane.compareAirplanes(airplane,airplane1);
    }
}