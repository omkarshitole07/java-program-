class Bank {
  private int id;  // primitive data type
  private Account acct;  // Object data type

  Bank() {
  }

  Bank (int myId,  Account myAcct) {
      id = myId;
      acct = myAcct;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setAccount(Account myAcct) {
      acct = myAcct;
  }

  public Account getAccount() {
      return acct;
  }

}