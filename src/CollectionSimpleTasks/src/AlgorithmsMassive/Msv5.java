package CollectionSimpleTasks.src.AlgorithmsMassive;

import java.util.Arrays;
import java.util.Random;

public class Msv5 {
    public static void main(String[] args) {
        Random r =new Random();
        int ms1 [] = new int[5];
        int ms2 [] = new int[5];
        int w = 0;
        for (int i =0; i < 5; i++){
            ms1[i] = r.nextInt(15);
            ms2[i] = r.nextInt(15);
        }
        System.out.println(Arrays.toString(ms1));
        System.out.println(Arrays.toString(ms2));

        double average1=0;//цикл
        double average2=0;//сложение чисел друг с другом 1 массива
        double konec1 = 0;//среднее число 1 массива
        double cykl1 = 0;//цикл 2
        double cykl2=0;//сложение чисел 2 массива
        double konec2=0;//среднее число 2 массива
        for (int i = 0; i<5; i++) {
            average1 = ms1[i] ;
            average2+=average1;
            konec1 = average2/5;
            cykl1 = ms2[i];
            cykl2+=cykl1;
            konec2 = cykl2/5;


        }//System.out.println("Среднее число первого массива = " + konec1);
        //System.out.println("Среднее число второго массива = " + konec2);
        if(konec1 > konec2){
            System.out.println("Среднее число первого массива больше и равняется " + konec1);
        }else if (konec2 > konec1){
            System.out.println("Среднее число второго массива больше и равняется " + konec2);
        }else {
            System.out.println("Среднее число первого массива " + konec1 + " И среднее число второго массива" + konec2 + " равны");
        }


    }
}
