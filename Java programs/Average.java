import java.util.Scanner;

class Average {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int midtermExam;
      int finalExam;
      double avg;

      System.out.print("Enter midterm: ");
      midtermExam = scan.nextInt();

      System.out.print("Enter final: ");
      finalExam = scan.nextInt();

      System.out.println("midterm=" + midtermExam + "  final=" + finalExam);

      avg = (midtermExam + finalExam) / 2.0;

      System.out.println("avg=" + avg);
   
      if (avg >= 90) {
         System.out.println("A");
      } else
      if (avg >= 80)
         System.out.println("B");
      else
      if (avg >= 70)
         System.out.println("C");
      else
         System.out.println("F");

/*
      if (avg >= 90 && avg <= 100)
         System.out.println("A");
      else
      if (avg >= 80 && avg < 90)
         System.out.println("B");
      else
      if (avg >= 70 && avg < 80)
         System.out.println("C");
      else
      if (avg < 70)
         System.out.println("F");
*/

/*
      if (avg >= 90 && avg <= 100)
         System.out.println("A");
     
      if (avg >= 80 && avg < 90)
         System.out.println("B");

      if (avg >= 70 && avg < 80)
         System.out.println("C");

      if (avg < 70)
         System.out.println("F");
*/
         
/*
      if (avg >= 70)
        System.out.println("pass");
      else
        System.out.println("fail");
*/

   }

}