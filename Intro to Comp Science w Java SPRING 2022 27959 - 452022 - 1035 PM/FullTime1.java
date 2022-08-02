class FullTime extends Employee {
     private double salary;

     FullTime() {
       System.out.println("in constructor:  FullTime()");
     }

     FullTime(String nm) {
       // super(nm);
       setName(nm);
       System.out.println("in constructor:  FullTIme(String nm)");
     }

     FullTime(double sal) {
       salary=sal;
     }

     public void setSalary(double amt) {
           salary = amt;
     }
     public double getSalary() {
           return salary;
     }

     public double pay() {
         System.out.println("FullTime::Pay()");
         return salary;
     }

     public String toString() {
        String s = "in FullTime toString():  name=" + getName();
        return s;
     }
 }
