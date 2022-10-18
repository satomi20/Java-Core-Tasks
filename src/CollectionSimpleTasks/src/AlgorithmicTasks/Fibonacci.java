package CollectionSimpleTasks.src.AlgorithmicTasks;

public class Fibonacci {
    public static void main(String[] args) {
        int a =0 ;
        int b =1 ;
        int chislo;
        for(int i = 3; i<=12; i++){
            chislo = a + b;
            a = b;
            b = chislo;
            System.out.println(chislo);
        }
    }
}
