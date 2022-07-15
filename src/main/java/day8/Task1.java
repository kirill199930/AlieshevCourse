package day8;

public class Task1 {
    public static void main(String[] args) {

        long t = System.currentTimeMillis();
        String str = " ";
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }

//        long n = System.currentTimeMillis();
//        System.out.println(str);
//        long tt = n - t;
//        System.out.println("Time String" + tt);




        long t1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        long n1 = System.currentTimeMillis();


        System.out.println(stringBuilder);
        long tt1 = n1 - t1;
        System.out.println("Time StringBuilder " + tt1);





    }
}

