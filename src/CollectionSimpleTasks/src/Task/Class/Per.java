package CollectionSimpleTasks.src.Task.Class;

import java.util.Scanner;

public class Per {
    public int num;
    private long num1;
    protected boolean que;
    public String name;

    public long out;
    public long gg;

    public long getNUM2(){
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        num1 = scan.nextInt();
        out = num * num1;
        System.out.println(out);
        return out;
    }
    public long getPlus(){
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        num1 = scan.nextInt();
         gg = num + num1;
        System.out.println(gg);
        return gg;

    }
    public long ff(){
        System.out.println(out);
        return out;
    }
    public long dd(){
        System.out.println(gg);
        return gg;
    }
}
