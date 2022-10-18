package MiniTasks.src.RecordingFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        File file = new File("ssssssssssss.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("DAROVA BANDITY");
            fw.close();
        }catch (IOException E){
            System.out.println("error");
        }
        try {
            if (file.createNewFile()){
                System.out.println("File was created " + file.getName());
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("SHIIIIIIIIIIIIIIIIIIIIIISH");
        }

        if (file.delete()){
            System.out.println("BYE");
        }else{
            System.out.println("problem");
        }
    }
}
