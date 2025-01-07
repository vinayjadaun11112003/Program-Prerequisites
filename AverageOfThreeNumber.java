import java.util.*;
 class AverageOfThreeNumber {
    public static double Average(double first, double second, double third){
        return (first+second+third)/3;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double first = s.nextDouble();
        System.out.println("Enter first number : ");
        double second = s.nextDouble();
        System.out.println("Enter first number : ");
        double third = s.nextDouble();

        double Average = Average(first,second,third);

        System.out.println("The Average of three number is : "+Average);
        s.close();
    }
}
