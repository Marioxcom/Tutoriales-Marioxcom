import java.util.*;

public class VecesSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] matriu = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matriu[i][j] == matriu[j][i]) {
                    continue;
                } else {
                    count++;
                }
            }
        }

        if(count == 0){System.out.println("TRUE");
        } else {System.out.println("FALSE");}
    }
}

