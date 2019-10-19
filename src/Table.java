import java.util.ArrayList;

public class Table {

    private ArrayList<String> tableArraylist = new ArrayList<String>();


    public void isUsed(int place, String XO) {

        if (tableArraylist.get(place).equals("X")) {
            System.out.println("Field allready taken!");

        }
        if (tableArraylist.get(place).equals("O")) {
            System.out.println("Field allready taken!");
            isUsed(place, XO);
        }
        tableArraylist.set(place, XO);
        output();

    }




    public void output() {
        for(int i = 0; i < 9; i++) {
            System.out.print(tableArraylist.get(i));
            if((i+1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print("|");
            }
        }
    }
    public void newTable() {
        for (int i = 0; i < 9; i++) {
            tableArraylist.add(Integer.toString(i+1));

        }

    }

    public void isWon(String FirstPlayerName, String SecondPlayerName) {
        String firstPlayerTable = "0";
        for(int i = 0; i < 9; i++) {
            if (tableArraylist.get(i).equals("X")) {
                firstPlayerTable += i + 1;
            }
        }
        if(firstPlayerTable.contains("123")|| firstPlayerTable.toString().contains("456")|| firstPlayerTable.toString().contains("789")|| firstPlayerTable.toString().contains("147")|| firstPlayerTable.toString().contains("258")|| firstPlayerTable.toString().contains("369")|| firstPlayerTable.toString().contains("159")|| firstPlayerTable.toString().contains("357")) {
            System.out.println(FirstPlayerName + " wins!!");
        }
        String secondPlayerTable = "0";
        for (int i = 0; i < 9; i++) {
            if (tableArraylist.get(i).equals("O")) {
                secondPlayerTable += i + 1;
            }
        }
        if (secondPlayerTable.contains("123") || secondPlayerTable.toString().contains("456") || secondPlayerTable.toString().contains("789") || secondPlayerTable.toString().contains("147") || secondPlayerTable.toString().contains("258") || secondPlayerTable.toString().contains("369") || secondPlayerTable.toString().contains("159") || secondPlayerTable.toString().contains("357")) {
            System.out.println(SecondPlayerName + " wins!!");
        }
    }



}


