package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List car = new ArrayList<>();
        car.add("Mers");
        car.add("Bmw");
        car.add("Nissan");
        car.add("Audi");
        car.add("Tesla");
        car.add(2,"Ford");
        car.remove(0);
        for (Object i: car){
            System.out.println(i);
        }
    }
}
