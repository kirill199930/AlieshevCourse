package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        picker.doWork();
        picker.bonus();
        picker.bonus();
        picker.getSalary();

        System.out.println(picker);

        courier.doWork();
        courier.bonus();
        courier.bonus();
        System.out.println(courier);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();


        }

        for (int i = 0; i < 1000000; i++) {
            courier.doWork();


        }

        System.out.println(courier);
        System.out.println(picker);

    }
}
