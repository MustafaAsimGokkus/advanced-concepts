package advancedconcepts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFiles {
    public static void main(String[] args) {
//        File folder = new File("FolderToWrite");
//        folder.mkdir();

        //create a file under FolderToWrite
      File file = new File("FolderToWrite/FileToWrite.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileWriter fw = new FileWriter(file,true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters.");
//            bw.newLine();
//            bw.write("The buffer size may be specified, or the default size may be accepted");
//            bw.newLine();
//            bw.write("The default size is large enough for most purposes");
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//recommended
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
            bw.write("Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters.");
            bw.newLine();
            bw.write("The buffer size may be specified, or the default size may be accepted");
            bw.newLine();
            bw.write("The default size is large enough for most purposes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
