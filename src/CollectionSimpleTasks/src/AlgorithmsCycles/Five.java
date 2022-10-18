package CollectionSimpleTasks.src.AlgorithmsCycles;

//Положительные
public class Five {
    public static void main(String[] args) {
        int[] numbers = {234, 13, -12, -23, 34};
        int Positive = 0;
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] > 0) {
                Positive++;
            }
        }
        System.out.printf("Положительных чисел: %d%n", Positive);
    }
}
