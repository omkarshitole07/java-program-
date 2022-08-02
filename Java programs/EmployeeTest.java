class EmployeeTest {

  public static void main(String[] args) {

     FullTime jillFT = new FullTime("jill fulltime");
     // jillFT.setName("jill FT");
     jillFT.setSalary(50000);
    
     // System.out.println("name=" + jillFT.getName() + " salary=" + jillFT.getSalary());
     System.out.println("name=" + jillFT.getName() + " salary=" + jillFT.pay());

     PartTime billPT = new PartTime();
     billPT.setRate(10);
     billPT.setHour(10);
     billPT.setName("bill PT");
     System.out.println("name=" + billPT.getName() + " salary=" + billPT.pay());


  }

}