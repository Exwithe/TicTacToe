import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to TicTacToe2019");

        System.out.println("Enter first player!");


        Scanner scanner = new Scanner(System.in);
        String firstPlayerName = scanner.nextLine();
        Player firstPlayer = new Player(firstPlayerName, "X");

        System.out.println("Enter second player");
        String secondPlayerName = scanner.nextLine();
        Player secondPlayer = new Player(secondPlayerName, "O");

        Table table = new Table();
        table.newTable();
        table.output();
        firstPlayer.play();
        for (int i = 0; i < 4; i++) {
            secondPlayer.play();
            firstPlayer.play();
        }
        System.out.println(firstPlayer.getPlayerName() + " 's turn!");
        scanner.close();
    }
}
