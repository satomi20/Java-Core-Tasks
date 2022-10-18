package Clothes.src.Jackets;

import java.util.Scanner;
public class GucciJacket implements Jacket{

    public int info;
    Scanner scan = new Scanner(System.in);



    @Override
    public void jacket_off(){
        System.out.println("Нажмите 1 чтобы снять Gucci Jacket");
        info = scan.nextInt();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        if (info == 1){
            info = 1;
            System.out.println("Gucci Jacket снят");
        }else {
            System.out.println("Рука застряла");
        }
    }

    @Override
    public void jacket_on(){
        System.out.println("Нажмите 2 чтобы одеть Gucci Jacket");
        info = scan.nextInt();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        if (info == 2){
            info = 2;
            System.out.println("Gucci Jacket одет");
        }else {
            System.out.println("Вы инвалид");
        }
    }



}
