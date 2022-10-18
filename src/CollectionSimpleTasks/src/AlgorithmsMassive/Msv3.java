package CollectionSimpleTasks.src.AlgorithmsMassive;
import java.util.Random;

public class Msv3 {
    public static void main(String[] args) {

        Random r = new Random();
        int [] ms = new int[99];
        for(int i = 0; i < 15; i++){
           int j = r.nextInt(99);
            //System.out.println(j);
            int w = 0;
            w = j;
            if(w%2!=1) {
                ms[i]=w;
                System.out.print(w + " ");
            }
        }
    }
}
