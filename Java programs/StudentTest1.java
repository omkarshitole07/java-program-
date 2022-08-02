class StudentTest {

  public static void main(String[] args) {

    Student joe = new Student();
    joe.midtermExam = 90;
    joe.finalExam = 100;

    double joeAvg;
    char joeGrade;
    joeAvg = joe.calcAvg();
    System.out.println("joe avg=" + joeAvg);
    joeGrade = joe.getLetterGrade();
    System.out.println("joe grade =" + joeGrade);

    Student bob = new Student();
    bob.midtermExam = 50;
    bob.finalExam = 25;
    double bobAvg;
    char bobGrade;
    bobAvg = bob.calcAvg();
    System.out.println("bob avg=" + bobAvg);
    bobGrade = bob.getLetterGrade();
    System.out.println("bob grade =" + bobGrade);
  }

}