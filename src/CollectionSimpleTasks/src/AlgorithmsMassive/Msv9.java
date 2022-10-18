package CollectionSimpleTasks.src.AlgorithmsMassive;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Msv9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int size = scan.nextInt();
        int [] msv = new int[size];
        int countl = 0, countr = 0;

        for(int i = 0; i < msv.length; i++){
            msv[i] = ran.nextInt(15);
            if(i<=msv.length/2-1){
                countl+=Math.abs(msv[i]);
            }
            else {
                countr+=Math.abs(msv[i]);
            }
        }System.out.println(Arrays.toString(msv));

        if (countl > countr){
            System.out.println("Сумма левой половины массива больше и составляет: " + countl);
        }else if (countr > countl){
            System.out.println("Сумма правой половины массива больше и составляет: " + countr);
        }else {
            System.out.println("Суммы равны");
        }
    }
}
