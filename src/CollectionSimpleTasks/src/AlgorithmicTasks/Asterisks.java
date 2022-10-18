package CollectionSimpleTasks.src.AlgorithmicTasks;

public class Asterisks {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i-- ) { // переменная i отсчитывает строки
            for (int j = 0 ; j < i; j++ ) { // печатаем букву i раз
                System.out.print ('*'); // печатаем 'a' без пробелов
            }
            System.out.println (); //поставить enter для новой строчки
        }
    }
}

