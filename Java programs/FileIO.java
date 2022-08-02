import java.util.Scanner;
import java.io.File;

class FileIO {

   public static void main(String[] args) throws Exception {

      File f = new File("textfile.txt");
      Scanner scan = new Scanner(f);

      int cnt=0;
      while (scan.hasNextLine()) {

         String s = scan.nextLine();
         System.out.println(s);

         String[] strarr = s.split(" ");
         for (int i=0; i<strarr.length; i++) {
            System.out.println("  index=" + i + "  word=" + strarr[i]);
            if (strarr[i].toLowerCase().contains("day"))
                cnt++;
         }

      }

      System.out.println("day count=" + cnt);

   }

}