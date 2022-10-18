package MiniTasks.src.RecordingFiles;

import java.io.*;

public class Censura {

    public static void main(String[] args) throws IOException {
        File fl = new File("Text");
        File bllst = new File("Blacklist");
        BufferedReader fail = new BufferedReader(new FileReader(fl));
        BufferedReader black = new BufferedReader(new FileReader(bllst));
        //Scanner scan = new Scanner(fl);
        //Scanner scanbl = new Scanner(bllst);
        String a;
        String b;
        String file;
        String bl;
    }
}
