package MiniTasks.src.RecordingFiles;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeTwo {

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("D:\\2.txt");
        Scanner in = new Scanner(new File("D:\\FILEFIL.txt"));
        String s;
        while (in.hasNext()) {
            s = in.next();//.replaceAll("[<0-9?!.,\\s>]+", "") ;
            if (isPalindrome(s)) {
                System.out.println(s);
                fr.write(" " + s);
            }
        }
        fr.close();
    }

}
