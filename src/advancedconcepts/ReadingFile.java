package advancedconcepts;

import java.io.*;
import java.util.Scanner;
/*
1)Scanner cannot be used in multithreading
BufferedReader is multithreaded

 2)Scanner cannot be used in synchronization
 Bufferec reader is synchronized

 3)Scanner can be used for data till 1KB
 Buffered reader can be used with larger data up to 8kb

 4)Scanner is slower than Buffered reader.
 */
public class ReadingFile {
    public static void main(String[] args) {

        //1. way to read file
//        try(BufferedReader br=new BufferedReader(new FileReader("FolderToWrite/FileToWrite.txt"))){
//       String line;
//       while((line= br.readLine()) != null){
//           System.out.println(line);
//       }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
         //2nd way
//        try(Scanner scan = new Scanner(new File("FolderToWrite/FileToWrite.txt"))) {
//        String line;
//        while((scan.hasNext())){
//        line= scan.nextLine();
//           System.out.println(line);
//       }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//3rd way
       //reading the text character by character
        try(FileInputStream fis = new FileInputStream("FolderToWrite/FileToWrite.txt")){
           int k;
           while((k=fis.read()) != -1){
               System.out.print((char)k);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
