package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        Random random = new Random();
        random.nextInt();



        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);

        }

        System.out.println(Arrays.toString(arr));

        int max = 0;
        for (int el : arr) {
            if (el > max) {
                max = el;
            }
        }
        System.out.println(max);

        int min = 1000;
        for (int el: arr){
            if (el < min ) {
                min = el;
            }
        }
        System.out.println(min);

        int counter = 0;
        for (int count : arr) {
            if(count % 10 == 0) {
                counter++;
            }
        }
        System.out.println("Counter " + counter);

        int sum = 0;
        for (int count : arr) {
            if(count % 10 == 0) {
                sum += count;
            }
        }
        System.out.println("Sum " + sum);


    }
}
