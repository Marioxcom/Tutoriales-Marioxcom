import java.util.*;

public class VecesSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVotantes = sc.nextInt();
        int maxPartidos = 100;

        int[] votos = new int[maxPartidos + 1];

        for (int i = 0; i < numVotantes; i++) {
            int partido = sc.nextInt();
            votos[partido]++;
        }

        int maxVotos = Integer.MIN_VALUE;
        int numPartidoGanador = 0;
        for (int i = 0; i <= maxPartidos; i++) {
            if (votos[i] > maxVotos){
                maxVotos = votos[i];
                numPartidoGanador = i;
            }
        }
        System.out.println(numPartidoGanador);
    }
}

