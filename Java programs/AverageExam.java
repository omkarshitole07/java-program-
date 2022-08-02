import java.util.Scanner;

class AverageExam {

  public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     int input;

     int sumExam=0;
     int numExam=0;
     double avg = 0.0;

     System.out.println("Enter exam or -1 to quit");
     input = scan.nextInt();

     while (input != -1) {
       // only valid exam scores
       if (input>=0 && input<=100) {
          sumExam = sumExam + input;
          numExam = numExam + 1;
       } else {
          System.out.println("invalid score - value between 0 and 100");
       }
         
        System.out.println("Enter exam or -1 to quit");
        input = scan.nextInt();      
     }

     System.out.println("sumExam=" + sumExam + "  numExam=" + numExam);

     if (numExam > 0) { 
       avg = sumExam / (double)numExam;     
     } else {
       System.out.println("No exam entered");
     }

     System.out.println("avg=" + avg);

  }

}