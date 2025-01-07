import java.util.*;
 class powerCalculation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value of Base : ");

        double base = s.nextDouble();

        System.out.println("Please enter the value of Exponent : ");

        double exponent = s.nextDouble();

        double power = Math.pow(base,exponent);

        System.out.println("Power value of the given data is : "+power);
        s.close();
    }
}
