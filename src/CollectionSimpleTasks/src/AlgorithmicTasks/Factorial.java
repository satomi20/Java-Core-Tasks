package CollectionSimpleTasks.src.AlgorithmicTasks;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вставьте число: ");
        int factorial = in.nextInt();
        long num = 1;
        for(int i = 1; i <= factorial; i++){
            num = num * i;
        }long sum = num;
        System.out.println("Факториал числа " + factorial + " равен " + sum);
    }
}
