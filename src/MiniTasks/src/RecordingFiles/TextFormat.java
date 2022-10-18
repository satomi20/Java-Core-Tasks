package MiniTasks.src.RecordingFiles;

import java.io.*;

public class TextFormat {

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static String Apple(String str){
        str.length();
        int words = new java.util.StringTokenizer(str," ").countTokens();
        return str;
    }

    public static void main(String[] args) throws IOException {
        File fr = new File("WORDS");
        FileWriter fileWriter = new FileWriter("BOBO", true);
        try (BufferedReader br = new BufferedReader(new FileReader(fr))){
            String c;
            int count = 0;
            while ((c=br.readLine()) != null) {
                if (isPalindrome(c)) {
                    fileWriter.write(c + "\n");
                }else  if (c.length() > 3){
                    //c.length() > 3
                    //fileWriter.write(c + "\n");
                    //int words = new java.util.StringTokenizer(c," ").countTokens();
                    //System.out.println("Количество слов в строке " + words);
                    //System.out.println(c.split("\\s+").length);
                }
            }
            fileWriter.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
