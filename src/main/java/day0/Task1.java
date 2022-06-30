package day0;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.print("JAVA");
            count++;
        }

        for (int count1 = 0; count1 < 10; count1++) {
            System.out.print("JAVA ");
        }

        for (int count2 = 0; count2 < 10; count2++) {
            System.out.println("JAVA");
        }

        int year = 1980;

        while (year <= 2020) {
            //System.out.println("Олимпиада " + year + " года");
            year+=4;
        }

        for (int ye = 1980; ye <= 2020; ye += 4) {
            System.out.println("Олимпиада " + ye + " года");
        }

        int k = 2;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x 2 = " + i * k);
        }




    }
}
