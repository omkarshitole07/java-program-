// first program in java
class HelloArgs {

  public static void main(String[] args) {
   
   if (args.length < 2)
      System.out.println("need two arguments (first name and last name)");
   else
      System.out.println("Hello " + args[0] + " " + args[1]);

  }

}