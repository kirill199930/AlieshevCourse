package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (count <= 5) {
            double divide = sc.nextDouble();
            double divide1 = sc.nextDouble();
            count++;
            if (divide1 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double result = divide / divide1;
            System.out.println(result);






        }
    }
}
