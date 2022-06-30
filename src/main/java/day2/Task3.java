package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();


        while (num <= num1 ){
            if ((num % 5 == 0) && (num % 10 != 0)) {
                System.out.print(num + " ");
            }
            num++;
        }
        //if (num >= num1) System.out.println("Некорректный ввод");
    }
}
