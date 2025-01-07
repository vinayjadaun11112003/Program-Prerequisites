import java.util.*;
class KilosIntoMiles{
    public static double convertMiles(double kilometers){
        return kilometers*0.621371;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Kilometers value : ");
        double Kilometers = s.nextDouble();
        double miles = convertMiles(Kilometers);
        System.out.println("Value of Kilometers into Miles is : "+miles);
        s.close();
    }
}