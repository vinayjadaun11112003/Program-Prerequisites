import java.util.*;
 class celsiusToFahrenheit {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the temperature in celcius: ");
    int tempincelcius=s.nextInt();
    int convertedFahrenheitvalue=(tempincelcius* 9/5)+32;
    System.out.println("converted value of celcius to fahrenheit is : "+convertedFahrenheitvalue);
    s.close();
    }
}
