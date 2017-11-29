
/*
@author Marina Yesakova
 */
import java.util.Scanner;

public class InterestEarned 
{
    public static void main(String[] args) 
    {
        double principal; //hold the value of the investment
        double rate; // hold the annual interest rate
        double interest; // hold interest earned in one year
        int timesCompaunded; // hold the number of times the interest is compounded
        double amount; // hold the amount in savings
        
        // create scanner object to read input 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of the investment $");
        principal = keyboard.nextDouble(); // input the principal
        System.out.println("Enter the interest rate in % ");
        rate = keyboard.nextDouble(); // input the the interest rate        
        System.out.println("Enter the number of times the interest is compounded ");
        timesCompaunded = keyboard.nextInt(); // input the number of times the interest is compounded
        amount = principal * Math.pow ((1 + (rate/100.0) / timesCompaunded), timesCompaunded); // calculate the amount
        interest = amount - principal;//finding the interest
        
        //output results
        System.out.println("Interest rate: "+ rate + "%");
        System.out.println("Times compounded: " + timesCompaunded);        
        System.out.printf("Principal: $%.2f\n", principal);
        System.out.printf("Interest: $%.2f\n", interest); 
        System.out.printf("Amount in Savings: $%.2f\n", amount);           
    } //end of main
} // end of class InterestEarned
