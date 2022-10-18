package CollectionSimpleTasks.src.AlgorithmsMassive;

import java.util.Arrays;
import java.util.Random;
//Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//какой элемент является в этом массиве максимальным и сообщите индекс его
//последнего вхождения в массив.
public class Msv7 {
    public static void main(String[] args) {

        Random r = new Random();
        int msv[] = new int[12];
        for (int i = 0; i < 12; i++) {
            msv[i] = r.nextInt(15);
            //System.out.println(Arrays.toString(msv));
            //System.out.println();

        }
        System.out.println(Arrays.toString(msv));
        //max = Arrays.stream(msv).max().getAsInt();
        //System.out.println(max);
        int max = msv[0];
        int index = 0;
        for (int i = 0; i < msv.length; i++) {
            if (msv[i] >= max ) {
                max = msv[i];
                index = i;
            }
        }System.out.println("Максимальное число " + max + " Индекс числа " + index);
    }
}