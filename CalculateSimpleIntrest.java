import java.util.*;
 class CalculateSimpleIntrest {
    public static double Interest(double p, double i, double t){
        return (p*i*t)/100;
    }
    public static void main(String[] arsg){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Principal amount : ");
        double principal = s.nextDouble();
        System.out.println("Please Enter Rate of Interest : ");
        double interest=s.nextDouble();
        System.out.println("Please Enter Time : ");
        double time=s.nextDouble();

        double Interest = Interest(principal,interest,time);
        
        System.out.println("The Interest Amount will be : "+ Interest);


        s.close();
    }
}
