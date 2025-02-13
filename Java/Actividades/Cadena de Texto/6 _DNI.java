import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] cadena = {'T', 'R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int divisio = Math.round(num % 23);
        System.out.println(Integer.toString(num) + cadena[divisio]);
    }
}
