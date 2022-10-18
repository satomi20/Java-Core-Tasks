package MiniTasks.src.RecordingFiles;

import java.io.File;

public class FileCreator {

    public void Creat(){
    try {
        File file = new File("D:\\example.txt");
        if (file.createNewFile())
            System.out.println("File created");
        else
            System.out.println("File already exists");
    }
        catch (Exception e) {
        System.err.println(e);
    }
}
}
