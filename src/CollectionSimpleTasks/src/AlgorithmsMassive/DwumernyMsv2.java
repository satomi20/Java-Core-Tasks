package CollectionSimpleTasks.src.AlgorithmsMassive;

import java.util.Arrays;
import java.util.Random;

public class DwumernyMsv2 {

    public static void main(String[] args) {
        Random r = new Random();
        int a = 3;
        int b = 3;
        int[][] mas = new int[a][b];
        int[] msv1 = new int[a * b];
        int ctr = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas[i][j]= r.nextInt(9);
                msv1[ctr++] = mas[i][j];
            }
        }
        Arrays.sort(msv1);

        ctr = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas[i][j] = msv1[ctr++];

            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mas[i][j] + " ");

            }
            System.out.println();
        }
    }
}
