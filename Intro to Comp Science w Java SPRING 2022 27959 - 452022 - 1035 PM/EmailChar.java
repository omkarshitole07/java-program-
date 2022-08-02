class EmailChar {

  public static void main(String[] args) {
    char[] emailChr = {'j','c','h','i','n','@','p','a','c','e','.','e','d','u'};

    // String  emailStr = new String(emailChr);
    String emailStr = new String("bill@msft.com");

    int pos = emailStr.indexOf('@');
    System.out.println("pos= " + pos);

    String name = emailStr.substring(0,pos);
    System.out.println("name=" + name);    

  }

}