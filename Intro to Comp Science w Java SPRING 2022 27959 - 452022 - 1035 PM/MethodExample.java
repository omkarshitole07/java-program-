class MethodExample {

  static void printHelloWorld() {
    System.out.println("Hello Word from method");
  }

  static int square(int num) {

     int return_value;
     return_value = num * num;
     return return_value;

  }

  static int absolute(int num) {
     int return_value;
     if (num>=0)
       return_value = num;
     else
       return_value = num * -1;
     return return_value;
  }

  static int minimum(int num1, int num2) {
    int return_value;

    if (num1>num2)
      return_value = num2;
    else
      return_value = num1;

    return return_value;
  }

  static boolean isOdd(int num) {
     if (num%2==0)
       return false;
     else
       return true;
  }

  public static void main(String[] args) {

    if (isOdd(10))
       System.out.println("number is odd");
    else
       System.out.println("number is even");

/*
    int value;
    value = minimum(5,10);  // value = Math.min(5,10)
    System.out.println("minimum is: " + value);
*/

/*
     int value;
     value = absolute(-8);  // value = Math.abs(-8)
     System.out.println("The absolute value is: " + value);
*/ 
/*    
     int value;
     value = square(5);
     System.out.println("The square of number is: " + value);
*/
     // printHelloWorld();
  }


}