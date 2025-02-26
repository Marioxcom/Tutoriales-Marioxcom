import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];




        for (int i = 0; i < num.length ; i++) {
            num[i] = sc.nextInt();
        }

        int ultimo = num[n - 1];

        for (int i = 0; i < num.length; i++) {
            num[i] += ultimo;
        }

        for(int nums : num){
            System.out.print(nums + " ");
        }

    }
}
