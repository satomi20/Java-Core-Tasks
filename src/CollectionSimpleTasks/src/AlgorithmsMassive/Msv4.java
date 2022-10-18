package CollectionSimpleTasks.src.AlgorithmsMassive;

import java.util.Random;

public class Msv4 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] msv= new int[20];
        for (int i = 0; i< msv.length; i++){
            int j = r.nextInt(20);
            int w = 0;
            w = j;
            //System.out.println(w);
        }
        for (int i = 1; i< msv.length; i +=2){
            int j = r.nextInt(20);
            msv[i] = j;
            System.out.print(j + " ");
        }
    }
}
