import java.util.Scanner;

public class Player {
    private String playerName;
    private String XO;

    public Player(String playerName, String XO) {
        this.playerName = playerName;
        this.XO = XO;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    Scanner scanner = new Scanner(System.in);
    Table table = new Table();

    public void play(){
        System.out.println(playerName + " 's turn!");

        switch (scanner.nextLine()) {
            case "1": table.isUsed(0,XO);
            case "2": table.isUsed(1,XO);
            case "3": table.isUsed(2,XO);
            case "4": table.isUsed(3,XO);
            case "5": table.isUsed(4,XO);
            case "6": table.isUsed(5,XO);
            case "7": table.isUsed(6,XO);
            case "8": table.isUsed(7,XO);
            case "9": table.isUsed(8,XO);
            default:
                System.out.println("Invalid Input");
        }
    }
    public boolean hasWon(char [] table) {



        return false;
    }
}
