class AccountTest {

  public static void main(String[] args) {

     Account joe = new Account();

     joe.setBalance(100);
     joe.deposit(200);

     System.out.println("joe balance= " + joe.getBalance());

     Account jill = new Account();

     jill.deposit(500);
     jill.withdraw(400);
     
     System.out.println("jill balance= " + jill.getBalance());

     Account bob = new Account(400.0);
     System.out.println("bob balance= " + bob.getBalance());

     Account sue = new Account(10,1000.0);
     System.out.println("sue balance= " + sue.getBalance());
     
  }

}