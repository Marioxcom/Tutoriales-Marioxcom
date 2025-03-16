import java.util.*;

public class VecesSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriu = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriu[j][i] + " ");
                if (j == n - 1){
                    System.out.println();
                }
            }
        }
    }
}

