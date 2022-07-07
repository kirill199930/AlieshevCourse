package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        System.out.println("Количество игроков на поле после создания первого экземпляра " + Player.getCountPlayers());
        Player player2 = new Player(100);
        Player player3 = new Player(100);
        Player player4 = new Player(90);
        Player player5 = new Player(90);
        Player player6 = new Player(90);
        Player player7 = new Player(0);
        Player player8 = new Player(1);

        System.out.println("Количество игроков на поле после создания седьмого экземпляра " + Player.getCountPlayers());
        Player.info();



        System.out.println("Выносливость игрока 1 " + player1.getStamina());
        player1.run();
        Player.info();

        player8.run();
        player8.run();


    }
}
