package MiniTasks.src.SubstringCutout;

import java.util.Scanner;

public class Cut {
    Scanner scan = new Scanner(System.in);
     private String str;

    public void replacement(){
        try {
            System.out.println("Напишите предложение из которого нужно вырезать подстроку от А до Б");
            str = scan.nextLine();
            String b = str.toLowerCase();
            String result = str.substring(b.indexOf("a"), b.lastIndexOf("b"));
            System.out.println(result);
        }catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println("Одной из букв не существует в вашем предложении");
        }
    }
    public void print(){
        //str = scan.nextLine();
        char c = str.charAt(0);
        char b = str.charAt(3);
        System.out.println(str.replace(b, c));
    }

    public void SVR(){
        replacement();
        print();
    }


}
