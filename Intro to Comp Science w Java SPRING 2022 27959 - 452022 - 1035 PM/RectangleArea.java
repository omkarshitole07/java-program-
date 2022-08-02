// calculate the area of a rectangle

import java.util.Scanner;

class RectangleArea {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int length;
    int width;
    int area;

    System.out.println("Enter a length:");
    length = scan.nextInt();

    System.out.println("Enter a width:");
    width = scan.nextInt();

    area = length * width;

    System.out.println("The area is " + area);

  }

}