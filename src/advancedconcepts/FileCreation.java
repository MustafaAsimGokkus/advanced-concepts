package advancedconcepts;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        //java will put it out of src if u write only the name and extention
//        File file = new File("FirstFile.txt");
//        file.createNewFile();
//        System.out.println("File created...");
//
//        File file2 = new File("FirstFileOutOfSrc.txt");
//        file2.createNewFile();
//        System.out.println("File created...");
//
//        File file3 = new File("src/FirstFileInSrc.txt");
//        file3.createNewFile();
//        System.out.println("File created...");
//
//        File file4 = new File("src/advancedconcepts/FirstFileAdvancedConceptsPackage.txt");
//        file4.createNewFile();
//        System.out.println("File created...");

        //create a file under documents folder in your local computer name it as your own name
        File file5 = new File("C:\\Users\\Asim\\Desktop\\ali.txt");
       file5.createNewFile();
        System.out.println("File in documents folder created...");



    }
}
