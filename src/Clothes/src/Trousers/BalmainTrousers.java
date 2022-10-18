package Clothes.src.Trousers;

import java.util.Scanner;

public class BalmainTrousers implements Trousers{
    public int info;
    Scanner scan = new Scanner(System.in);

    @Override
    public void trousers_off(){
        System.out.println("Нажмите 1 чтобы снять штаны Balmain");
        info = scan.nextInt();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        if (info == 1){
            info = 1;
            System.out.println("Balmain сняты");
        }else {
        }
    }

    @Override
    public void trousers_on(){
        System.out.println("Нажмите 2 чтобы одеть штаны Balmain");
        info = scan.nextInt();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        if (info == 2){
            info = 2;
            System.out.println("Balmain одеты");
        }else {
        }
    }

}
