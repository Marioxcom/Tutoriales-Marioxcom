import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n]; //Crea el Array con el número de espacios añadidos en 'n'

        for (int i = 0; i < array1.length; i++) { //Rellena los espacios hasta que 'i' llegue
            array1[i] = sc.nextInt();             //al maximo de espacios que .length cuenta
        }

        int m = sc.nextInt();
        int[] array2 = new int[m]; //Crea el Array con el número de espacios añadidos en 'm'

        for (int i = 0; i < array2.length; i++) {
                array2[i] = sc.nextInt();
        }

        int[] arrayFusio = new int[n + m]; //Este Array suma el número de valores de la array1 y 2

        for (int i = 0; i < array1.length; i++) {
            arrayFusio[i] = array1[i];
        }
                                                    // Va clonando los Arrays 1 y 2 en el Fusio
        for (int i = 0; i < array2.length; i++) {
            arrayFusio[n + i] = array2[i];
        }

        Arrays.sort(arrayFusio); //Arrays.sort ordena los valores que estan dentro del Array

        for(int arrays:arrayFusio){
            System.out.print(arrays + " ");
        }
    }
}
