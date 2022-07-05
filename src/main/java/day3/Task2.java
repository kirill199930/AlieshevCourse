package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double divide = sc.nextDouble();
            double divide1 = sc.nextDouble();
            if (divide == 0) return;
            if (divide1 == 0) return;
            double result = divide / divide1;
            System.out.println(result);


        }

    }
}