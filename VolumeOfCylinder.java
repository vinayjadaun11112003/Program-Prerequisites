import java.util.*;
class VolumeOfCylinder {
    public static double Volume(double radius,double height){
        return 3.14 * (radius*radius) * height;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius of Cylinder : ");
        double radius=s.nextInt();
        System.out.println("Enter the height of Cylinder : ");
        double height=s.nextInt();
        System.out.println("Volume of the cylinder based on the input is : "+Volume(radius,height));
    }
}
