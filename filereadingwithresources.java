import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReadingWithResources{
   public static void main(String []args){
     // Scanner reader = null;
      try(Scanner reader = new Scanner(new File("phones.txt"))){
      //File inFile = new File("phones.txt"); 
     // reader = new Scanner(inFile);
      while(reader.hasNextLine()){
       String line = reader.nextLine();
       System.out.println(line);
       }
         }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
         //   }finally{
         //      if(reader != null){
          //        reader.close();
           //       }
           //     }
   }
 }