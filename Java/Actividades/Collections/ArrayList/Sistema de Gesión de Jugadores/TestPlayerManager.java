import java.util.*;

public class TestPlayerManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerManager player = new PlayerManager("P",1);

        while (true) {
            System.out.println("""
                    ---Main-Player---
                    1. Add Player
                    2. Delete Player
                    3. Search Player
                    4. Modify Score
                    5. More..."""
            );
            System.out.print("Tria una de les opcions: ");
            int option = sc.nextInt();
            if (option == 5) {
                System.out.println("""
                        5. View Players with Score
                        6. Mayor Scorers
                        7. Best Player
                        8. View all Players"""
                );
                System.out.print("Tria una de les opcions: ");
                option = sc.nextInt();
            }
            switch (option) {
                case 1:
                    System.out.print("Write a new player: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Write her score: ");
                    int score = sc.nextInt();
                    System.out.println();
                    player = new PlayerManager(name,score);
                    player.addPlayer(player);
                    break;
                case 2:
                    System.out.print("Write the name that want delete: ");
                    String deleteName= sc.nextLine();
                    sc.nextLine();
                    if (player.getName().equalsIgnoreCase(deleteName)) {
                        player.delete(player);
                    }
                    break;
                case 3:
                    System.out.print("Write the name that want view: ");
                    String searchName= sc.nextLine();

                    if (player.getName().equalsIgnoreCase(searchName)) {
                        player.search(player);
                    }
                    break;
                default:
                    System.out.print("Tria una de les opcions: ");
                    option = sc.nextInt();
                    break;
            }
        }
    }
}