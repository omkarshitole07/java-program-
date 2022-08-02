class Account {

  private int id;
  private double balance;

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