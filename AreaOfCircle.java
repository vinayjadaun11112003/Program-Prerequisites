import java.util.*;
 class AreaOfCircle {
      public static double areaOfCircle(double r){
        double area = 3.14 * (r*r);
        return area;
      }
      public static void main(String[] ars){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of Radius of circle: ");
        double r = s.nextInt();
        double area = areaOfCircle(r);
        System.out.println(area);
      }
}
