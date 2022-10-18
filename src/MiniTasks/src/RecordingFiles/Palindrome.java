package MiniTasks.src.RecordingFiles;

import java.io.*;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) throws IOException {
        File fr = new File("palindrom");
        FileWriter fileWriter = new FileWriter("jojo", true);
        try (BufferedReader br = new BufferedReader(new FileReader(fr))){
            String c;
            while ((c=br.readLine()) != null) {
                if (isPalindrome(c)) {
                    fileWriter.write(c + "\n");
                }
            }
            fileWriter.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
