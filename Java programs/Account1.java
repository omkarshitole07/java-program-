class Account {

  private int id;
  private double balance;

  Account() {
    System.out.println("in constructor:  Account()");
    id = 0;
    balance = 0;
  }

  Account(double bal) {
    System.out.println("in constructor:  Account(double bal)");
    balance = bal;
  }

  Account(int id, double bal) {
    System.out.println("in constructor:  Account(int id, double bal)");
    this.id = id;
    balance = bal;
  }


  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setBalance(double amt) {
    balance = amt;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amt) {
     balance = balance + amt;
  }

  public void withdraw(double amt) {
    if (balance >= amt)
     balance = balance - amt;
  }

}