package CollectionSimpleTasks.src.AlgorithmsMassive;
//Puzyrek
import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        int [] array = new int[]{56,42,34,67,55,34};
        System.out.println(Arrays.toString(array));

        boolean Sorted = false;
        while (!Sorted) {
            Sorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    Sorted = false;

                }
            }
        }System.out.println(Arrays.toString(array));
    }
}