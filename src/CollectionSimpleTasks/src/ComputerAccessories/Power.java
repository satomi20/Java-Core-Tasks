package CollectionSimpleTasks.src.ComputerAccessories;

import java.util.Random;
import java.util.Scanner;

public class Power {

    public int switchOn() {
        Random ran = new Random();
        Scanner reader = new Scanner(System.in);
        int cykl = ran.nextInt(4);
        System.out.println("Компьютер включается");
        if (cykl == 3) {
            System.out.println("Сбой компьютера при включении. Введите число для успешного отключения ПК");
            int num = ran.nextInt(2);
            int input = reader.nextInt();
            do {
                if (num == input) {
                    System.out.println("Комп успешно выключен");
                } else {
                    System.out.println("ПК сгорел");
                }

                break;
            } while (num < 10);
        } else {
            System.out.println("Компьютер запущен");
        }
        return cykl;
    }
}
