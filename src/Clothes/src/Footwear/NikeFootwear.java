package Clothes.src.Footwear;

import java.util.Scanner;



public class NikeFootwear implements Footwear{
    public int info;
    Scanner scan = new Scanner(System.in);

    @Override
    public void footwear_off(){
        System.out.println("Нажмите 1 чтобы снять обувь Nike");
        info = scan.nextInt();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        if (info == 1){
            info = 1;
            System.out.println("Nike снята");
        }else {
        }
    }

    @Override
    public void footwear_on(){
        System.out.println("Нажмите 2 чтобы одеть обувь Nike");
        info = scan.nextInt();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException ex) {}
        if (info == 2){
            info = 2;
            System.out.println("Nike обувь одета");
        }else {
        }
    }
}
