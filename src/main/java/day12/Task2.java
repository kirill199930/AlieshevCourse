package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List num = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                num.add(i);
            }
        }

        List num1 = new ArrayList<>();
        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                num1.add(i);
            }
        }

        System.out.println(num);
        System.out.println(num1);
    }
}
