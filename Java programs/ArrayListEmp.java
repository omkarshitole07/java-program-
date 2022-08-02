import java.util.ArrayList;

class ArrayListEmp {

  public static void main(String[] args) {

     ArrayList<Employee>  empList = new ArrayList<Employee>( );  

     empList.add(new FullTime(50000.0));
     empList.add(new FullTime(10000.0));
     empList.add(new PartTime(10, 500));
 
/*      
     Employee e;
     for (int i=0;  i < empList.size( );  i++) {
        e = empList.get(i);
        if (e  instanceof  FullTime)
         System.out.println( ((FullTime)e).getSalary());
       else
       if (e  instanceof  PartTime)
         System.out.println( ((PartTime)e).getHour());
     }
  */

        
     Employee e;
     for (int i=0;  i < empList.size( );  i++) {
        e = empList.get(i);
         System.out.println( e.pay() );
     }


  }
}