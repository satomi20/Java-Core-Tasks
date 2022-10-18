package CollectionSimpleTasks.src.AlgorithmsMassive;
//Realization

import java.util.Arrays;
import java.util.Random;

public class Sortirovka1 {
    public static void main(String[] args) {

        int[] msv = new int[6];
        Random r = new Random();
        for (int i = 1; i < msv.length; i++) {
            msv[i] = r.nextInt(30);
            int current = msv[i];
            int j = i - 1;
            while (j >= 0 && current < msv[j]) {
                msv[j + 1] = msv[j];
                j--;
            }
            msv[j + 1] = current;
        }
        System.out.println(Arrays.toString(msv));
    }
}
