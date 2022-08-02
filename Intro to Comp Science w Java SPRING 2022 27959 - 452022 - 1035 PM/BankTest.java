class BankTest {

  public static void main(String[] args) {

     //Account joe = new Account(500.0);
     //Bank myBank = new Bank(1,joe);
     Bank myBank = new Bank(1,new Account(500.0));

     // Account acct = myBank.getAccount();
     // double bal = acct.getBalance();
     double bal = myBank.getAccount().getBalance();
  
     System.out.println("balance= " + bal);    

  }

}