package CollectionSimpleTasks.src.AlgorithmsMassive;
import java.util.Arrays;
import java.util.Random;
public class DvumernyMs {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] msv = new int [4] [4];
        for(int i = 0; i < msv.length; i++){
            for(int j = 0; j < msv[i].length; j++) {
                msv[i][j] = r.nextInt(50);
                //System.out.println(msv[i][j]);
            }
            System.out.println(Arrays.toString(msv[i]));
        }
    }
}
