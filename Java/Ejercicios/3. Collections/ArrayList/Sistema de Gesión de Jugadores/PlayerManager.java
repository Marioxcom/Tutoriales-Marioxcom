import java.util.ArrayList;
import java.util.List;

public class PlayerManager extends Player {
    ArrayList<Player> player = new ArrayList<>();
    public PlayerManager(String name, int score) {
        super(name, score);
    }

    public void addPlayer(Player players) {
        player.add(players);
    }

    public void delete(Player players) {
        player.remove(players);
    }

    public void search(Player players) {
        System.out.println(players);
    }

    @Override
    public String toString() {
        return "PlayerManager{" +
                "player=" + player +
                '}';
    }
}

