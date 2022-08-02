class RectangleTest {
  public static void main(String[] args) {

     Rectangle r1 = new Rectangle();
     int r1Area;

     r1.length = 10;
     r1.width = 20;

     r1Area = r1.calcArea();
     System.out.println("r1 area=" + r1Area);    

     Rectangle r2 = new Rectangle();
     int r2Area;

     r2.length = 30;
     r2.width = 5;

     r2Area = r2.calcArea();
     System.out.println("r2 area=" + r2Area);    

     System.out.println("static calc area:");
     int rectArea = Rectangle.calculateArea(4,5);
     System.out.println("The static area is " + rectArea);

     System.out.println("instance r2 static area=" + r2.calculateArea(30,5));


  }

}