package CollectionSimpleTasks.src.ConsoleHomeEasy;

import java.util.Scanner;

public class Door{
    public int open;
    Scanner scan = new Scanner(System.in);
    public short power;

    public int door(){
        System.out.println("Что вы думаете сделать с дверью?");
        System.out.println("1. Открыть либо закрыть");
        System.out.println("2. Проверить дверь");
        System.out.println("3. Уйти");
        open = scan.nextInt();

        switch (open){
            case 1:
                System.out.println("1 Для открытия, 2 чтобы закрыть");
                open = scan.nextInt();
                if (open == 1) {
                    open = 1;
                    System.out.println("Открываю");
                    return console();
                } else if (open == 2) {
                    open = 2;
                    System.out.println("Закрываю");
                }return open;

            case 2:
                System.out.println("Таксссс... Проверим дерь");
                if (open == 1) {
                    System.out.println("Дверь открыта");
                } else if (open == 2) {
                    System.out.println("Дверь закрыта");
                }return door();

            case 3:
                System.out.println("Ухожу");
                break;

        }return open;
    }

    public int console(){
        System.out.println("Вы видите приставку");
        System.out.println("1 для вкл или выкл, 2 для информации, 3 для выхода");
        power = scan.nextShort();
        switch(power) {
            case 1:
                System.out.println("ON/OFF. 1 для вкл, 2 для выкл");
                power = scan.nextShort();
                if (power == 1) {
                    power = 1;
                    System.out.println("Включение приставки");
                } else if (power == 2) {
                    power = 2;
                    System.out.println("Отключение приставки");
                }return console();
            case 2:
                System.out.println("INFO");
                if (power == 1) {
                    System.out.println("В данный момент приставка включена");
                } else if (power == 2) {
                    System.out.println("В данный момент приставка отключена");
                }return console();
            case 3:
                System.out.println("EXIT");
                return door();
        }
        return power;
    }
}
