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
  }

}