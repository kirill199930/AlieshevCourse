package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //int[] arr = new int[100];
        int[] arr = {23,453,234,56,675,355,345};
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10000);
//        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int s = 0;
            for (int j = 0; j < i + 3; j++) {
                s += arr[j];
            }
            if (s > max) {
                max = s;
                index = i;
            }

        }
        System.out.println(max);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }
}
