package CollectionSimpleTasks.src.AlgorithmsMassive;

import java.util.Arrays;
import java.util.Random;

public class Msv6 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] msv= new int[4];

        for(int i = 0; i<4; i++) {
            msv[i] = r.nextInt(10);

        }System.out.println(Arrays.toString(msv));
        for (int i = 0; i < msv.length; i++){
            if(i>0) {
                if (msv[i - 1] >= msv[i]) {
                    System.out.println("Прогрессия не возрастающая");
                    break;
                }
            }
            if (i == msv.length -1){
                System.out.println("Последовательность возрастающая");
            }
        }
    }
}
