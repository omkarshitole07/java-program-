class ExceptionExample {

  public static void myMethod() throws MyException {
     if (1==1)
       throw (new MyException("cs504 exception"));
     System.out.println("in method call myMethod");
  }

  public static void main(String[] args) {

 
    try {
      myMethod();
      System.out.println("after myMethod()");
    }  catch (MyException me) {
        System.out.println(me.getMsg());
    } finally {
        System.out.println("in finally block");
    }

      
/*
    int x;
    try {
      x = 10/0;

    } catch (Exception e) {
	System.out.println("cannot divide by zero");
    }
*/
  
  }
}