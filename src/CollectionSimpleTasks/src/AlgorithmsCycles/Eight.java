package CollectionSimpleTasks.src.AlgorithmsCycles;

public class Eight {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a < 259; a=a*2){
            sum = sum + a;
            System.out.println(sum);
        }
    }
}
