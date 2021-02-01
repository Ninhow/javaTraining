import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Allamo"); //Detta skapar en runtime error.
        items.add(4);
        items.add(5);
        printDoubledItems(items);
        System.out.println("====================================");
        ArrayList<Integer> items2 = new ArrayList<>();
        items2.add(1);
        items2.add(2);
        items2.add(3);
        //items2.add("Allamo"); //Detta skapar compile time error
        items2.add(4);
        items2.add(5);
        printDoubledItems2(items2);
        System.out.println("====================================");
        FootballPlayer allamo = new FootballPlayer("Allamo");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        BaseballPlayer pat = new BaseballPlayer("Pat");


        Team<FootballPlayer> theBest = new Team<>("The best team");
        //theBest.addPlayer(ronaldo);
        //theBest.addPlayer(pat);
        theBest.addPlayer(allamo);


    }
    private static void printDoubledItems(ArrayList array){
        for(Object i : array){
            System.out.println((Integer) i * 2);
        }
    }
    private static void printDoubledItems2(ArrayList<Integer> array){
        for(int i : array){
            System.out.println(i * 2);
        }
    }
}
