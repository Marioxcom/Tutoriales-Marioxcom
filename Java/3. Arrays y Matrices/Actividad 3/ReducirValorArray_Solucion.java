import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int min = Integer.MAX_VALUE;



        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
            if (array[i] < min) {
                min = array[i];
            }

        }

        for (int i = 0; i < array.length; i++) {
            array[i] -= min;
        }

        for(int num : array){
            System.out.print(num + " ");
        }

    }
}
