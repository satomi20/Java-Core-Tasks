package CollectionSimpleTasks.src.AlgorithmsMassive;

public class Msv {
    public static void main(String[] args) {

        //В переменной а будет храниться значение размера массива, которое получаю с помощью простого цикла
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) a++;
        }
        //Создаю массив, и используя цикл, заполню его ячейки. Сразу выведу на экран значения элементов массива в строку
        int[] Mas = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 == 1) {
                Mas[b] = i;
                //System.out.print(Mas[b] + " ");
                b++;
            }
        }
        for (int g = Mas.length -1; g >= 0; g--) {
            System.out.print(Mas[g] + " ");
        }
    }
}