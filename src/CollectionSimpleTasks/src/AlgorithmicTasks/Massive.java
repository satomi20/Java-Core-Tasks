package CollectionSimpleTasks.src.AlgorithmicTasks;

import java.util.Random;

public class Massive {
    public static void main(String[] args) {
        Random b = new Random();

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int w = 0;
            do{
                int j = b.nextInt(20);
                w = j;
            }while (w%2!=0);
            a[i] =w;
            //System.out.print(a[i] + " ");
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] > 10){
                a[i]=a[i] + 1;
            }else {
                a[i] = a[i] - 2;
            }
            System.out.print(a[i] + " ");
        }
    }
}


