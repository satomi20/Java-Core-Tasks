package CollectionSimpleTasks.src.AlgorithmsCycles;

public class Ten {

    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a < 100; a=a+2) {
            sum = sum + a;
            System.out.println(a + " " + sum);
        }
    }
}
