package CollectionSimpleTasks.src.AlgorithmsCycles;

public class One {

    public static void main(String[] args) {
        double Sum = 10;
        double n = 10;
        for(int i = 1;i < 7; i++)
        {
            n = n * 1.1;
            Sum += n;
            System.out.println(n);
        }
    }
}
