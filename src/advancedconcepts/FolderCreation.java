package advancedconcepts;

import java.io.File;

public class FolderCreation {
    public static void main(String[] args) {
        //if u type just folder name it will be created outside src
//        File folder1 = new File("FirstFolderOutOfSrc");
//        folder1.mkdir();//boolean return
//        System.out.println("Folder is created inside the project outside the src...");
        //if folder is under src it is named as package
//        File folder2 = new File("src/FirstFolderInSrc");
//        folder2.mkdir();//boolean return
//        System.out.println("Folder is created inside the project under the src...");

        File folder4 = new File("FirstFolderOutOfSrc/fld");
        folder4.mkdir();//boolean return
        System.out.println("Folder fld is created inside the FirstFolderOutOfSrc...");
    }
}
