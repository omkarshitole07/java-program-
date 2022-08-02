class Employee {
     private String name;

     Employee() {
       System.out.println("in constructor:  Employee()");
       name = "";
     }

     Employee(String nm) {
        System.out.println("in constructor:  Employee(String nm)");
        name = nm;
     } 

     public void setName(String nm) {
           name = nm;
     }
     public String getName() {
           return name;
     }

     public double pay() {
         System.out.println("Employee::Pay()");
         return 200.0;
     }
}
