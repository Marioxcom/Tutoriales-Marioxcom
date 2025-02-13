import java.util.*;

public class VecesSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriu1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu1[i][j] = sc.nextInt();
            }
        }

        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matriu2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu2[i][j] = sc.nextInt();
            }
        }
        int[][] matriuTotal = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriuTotal[i][j] = matriu1[i][j] + matriu2[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriuTotal[i][j] + " ");
                if (j == m - 1){
                    System.out.println();
                }
            }
        }
    }
}

