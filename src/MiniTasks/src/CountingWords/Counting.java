package MiniTasks.src.CountingWords;

import java.io.IOException;
import java.util.Scanner;

public class Counting {
    private String str;
    Scanner scan = new Scanner(System.in);

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static int StrLenght(String str) {
        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите предложение");
        String input = sc.nextLine();
        //Начальное количество слов равно 0
        int count = 0;
        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;

                }
            }
        }
        if (isPalindrome(input)) {
            System.out.println(input);
        } else {
            System.out.println("Вы ввели " + count + " слов");
        }
        return count;

    }


    public static void main(String[] args) throws IOException {
       Counting text = new Counting();
        Scanner scan = new Scanner(System.in);
        String j = text.getStr();
        j = scan.nextLine();
        StrLenght(j);
        //System.out.println(StrLenght(j));
        //FileReader fileReader = new FileReader("D:\\BOR.txt");
        //Scanner scanner = new Scanner(fileReader);
        //while (scanner.hasNextInt()){
        //    System.out.println(scanner.nextLine());
        //}


        /*FileWriter fr = new FileWriter("D:\\2.txt");
        Scanner in = new Scanner(System.in);
        String s;
        while (in.hasNext()) {
            s = in.nextLine();//.replaceAll("[<0-9?!.,\\s>]+", "") ;
            if (isPalindrome(s)) {
                System.out.println(s);
                fr.write(" " + s);
            }else if (StrLenght(s) )
        }
        fr.close();*/


    }





}
