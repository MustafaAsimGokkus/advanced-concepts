package advancedconcepts;

import java.io.File;

public class FileDeletion {
    public static void main(String[] args) {
        File fileToDelete = new File("src\\FirstFileInSrc.txt");
        if(fileToDelete.delete()){
            System.out.println("File deleted successfully");
        }else{
            System.out.println("File could not be deleted");
        }
    }
}
