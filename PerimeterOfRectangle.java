import java.util.*;
 class PerimeterOfRectangle {
    public static double perimeter(double length,double width){
        return 2 * (length + width);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter height of the Rectangle : ");

        double length = s.nextDouble();

        System.out.println("Enter height of the Rectangle : ");

        double width = s.nextDouble();

        double perimeter = perimeter(length,width);

        System.out.println("Perimeter of the Rectangle is : " + perimeter);



    }
}
