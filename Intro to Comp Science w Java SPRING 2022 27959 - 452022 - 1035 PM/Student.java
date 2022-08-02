class Student {
  int id;
  int midtermExam;
  int finalExam;

  double calcAvg() {
    return ( (midtermExam + finalExam) / 2.0 );
  }

  char getLetterGrade() {

    double avg = calcAvg();
    char grade;
    if (avg >= 90)
      grade = 'A';
    else if (avg >= 80)
      grade = 'B';
    else if (avg >= 70)
      grade = 'C';
    else
      grade = 'F';
  
    return grade;     

  }
}