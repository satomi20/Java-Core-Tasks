package CollectionSimpleTasks.src.AlgorithmsCycles;

public class Amoebas {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 3; i < 25; i += 3) {
            s += 2;
            System.out.println("Часов " + i +  " Амёб " + s);
        }
    }
}
