package CollectionSimpleTasks.src.AlgorithmsCycles;

//Положительные и отрицательные
public class Four {
    public static void main(String[] args) {
        int [] num = {20, 45, -6};
        int Negative = 0;
        int Positive = 0;
        for (int a=0; a < num.length; a++) {
            if (num[a] < 0) {
                Negative++;
            }else if (num[a] > 0) {
                Positive++;
            }
        } System.out.printf("Положительных: %d%nОтрицательных: %d%n", Positive, Negative);
    }
}
