package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();


        //else System.out.println("Ошибка ввода");
        //if (floor == 0)System.out.println("Ошибка ввода");
        //else if (floor == -1)System.out.println("Ошибка ввода");
        if (floor >= 1 && floor <= 4) System.out.println("Малоэтажный дом");
        else if (floor >= 5 && floor <= 8) System.out.println("Среднеэтажный дом");
        else if (floor >= 9) System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");



    }
}