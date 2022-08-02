class AccountException {

  public static void main(String[] args) {

     Account joe = new Account(500.0);
     
     joe.deposit(100.0);

     try {
       joe.withdraw(800.0);

     
     } catch (MyException me) {
       System.out.println("in MyException catch block");
       System.out.println(me.getMsg());
     } catch (Exception e) {
       System.out.println("in Exception catch block");
     } finally {
       System.out.println("joe balance=" + joe.getBalance());
     }

  }

}