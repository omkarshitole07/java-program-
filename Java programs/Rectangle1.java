class Rectangle {

   int length;
   int width;

   int calcArea() {
      return (length * width);
   }

   int calcPerimeter() {
      return (2 * (length + width));
   }

   static int calculateArea(int len, int wid) {
     return (len * wid);
   }

}