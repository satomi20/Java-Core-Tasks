package CosmoPolymorphism.src;

import java.util.Random;

public class Cosmodrom implements IStart{
private boolean check;

    @Override
    public boolean checkSys() {
        System.out.println("Проверка двигателя");
        Random ran = new Random();
        int b = ran.nextInt(5);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        if (b != 4 & b != 3 & b !=2) {
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
        int i = 10;
        while (i > 0){

            System.out.println(i);
            try {
                Thread.sleep(800);
            }catch(InterruptedException ex) {}
            i-=1;
        }
    }

    @Override
    public void Start() {
        System.out.println("Полетели");

    }

    public void Starting(){
        checkSys();
        if (check == true){
            EngineSt();
            Start();
        }

    }

    public static void main(String[] args) {
        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.Starting();
    }
}



