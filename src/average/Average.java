
package average;

import java.util.Scanner;


public class Average {
    
    public static void main(String[] args) {
       double num1;
       double num2;
       double num3;
       
       Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        num1 = input.nextDouble();
        System.out.print("Input the second number: ");
        num2 = input.nextDouble();
        System.out.print("Input the third number: ");
        num3 = input.nextDouble();
        System.out.print("The average value is " + calculateAverage(num1, num2, num3)+"\n" );
   

 }
      public static double calculateAverage(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
}
    


