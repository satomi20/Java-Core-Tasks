package CollectionSimpleTasks.src.AlgorithmicTasks;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        long multiplier = in.nextInt();
        System.out.print("Число " + multiplier + " делится на: " );

        int sum = 0;
        for(int i = 1; i <= multiplier; i++) {
            if ((multiplier % i) == 0) {
                sum++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей: " + sum);
    }
}
