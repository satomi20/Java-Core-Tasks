package CosmoPolymorphism.src;

import java.util.Random;
import java.util.Scanner;

public class Shatl implements IStart {
    private boolean check;
    Scanner scan = new Scanner(System.in);
    private int button;


    @Override
    public boolean checkSys() {
        System.out.println("Проверка двигателя");
        Random ran = new Random();
        int b = ran.nextInt(10);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        if (b > 3) {
            System.out.println("Предстартовая проверка проведена успешно");
            check = true;
        } else {
            System.out.println("Предстартовая проверка провалена");
            check = false;
        }
        return check;

    }

    @Override
    public void EngineSt() {
        System.out.println("Говорит Хьюстон, двигатели шаттла запущены, все системы в норме");
        System.out.println("Джонни нажимай пуск");
        button = scan.nextInt();
        System.out.println("Ну все");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        System.out.println("Мы дома");
    }

    @Override
    public void Start() {
        System.out.println("Автономная система шаттла: Старт шаттла");
    }

    public void Powering(){
        checkSys();
        if (check == true){
            EngineSt();
            Start();
        }
    }


}
