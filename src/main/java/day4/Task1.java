package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        Random random = new Random();
        random.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
           arr[i] = random.nextInt(10);
           sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);



        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) count++;
        }
        System.out.println("Количество чисел больше > 8  " + count);


        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count2++;
        }
        System.out.println("Количество чисел равных == 1  " + count2);



        int count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) count3++;

        }

        System.out.println("Количество четных чисел " + count3);

        int count4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) count4++;
        }

        System.out.println("Количество нечетных чисел " + count4);
        System.out.println("Сумма всех элементов массива: " + sum);






    }
}
