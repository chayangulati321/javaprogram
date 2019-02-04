import java.io.*;
import java.util.*;
class FileDemo1 {
   public static void main(String[] args) {
      File f = null;
      String temp;
      try {
            f = new File("C:\\xyz\\javaprogram\\filehandling\\files\\file.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
        temp = sc.next();
        if(temp.equals("exit")){
          break;
        }
        else
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }    } }
