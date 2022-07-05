package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        final int m = 12;
        final int n = 8;
        int Maxsum = 0;
        int index = 0;
        int [][] arr = new int[m][n];
        Random random = new Random();



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = random.nextInt(50);

            }
        }


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
               sum += arr[i][j];
            }
            if (sum >= Maxsum) {
                Maxsum = sum;
                index = i;

            }

        }

        System.out.println("sum " + Maxsum);
        System.out.println("index " + index);





    }
}
