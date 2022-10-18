package CollectionSimpleTasks.src.AlgorithmicTasks;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        String answer;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner(System.in);
        answer = inputAnswer.next ();
        switch (answer){
            case "троллейбус":
                System.out.println("правильный ответ");
                break;
            default:
                System.out.println("вы умерли");
        }
    }
}
