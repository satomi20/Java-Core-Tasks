package CollectionSimpleTasks.src.AlgorithmicTasks;

public class Coincidences {
    public static void main(String[] args) {
        int a = 0;
        for(int h = 0; h<=23; h++){
            for(int m = 1; m<=59; m++){
                if(h/10%10==m%10&h%10==m/10%10){
                    a++;
                }
            }
        }
        System.out.println("Всего " + a + " совпадений");
    }
}
