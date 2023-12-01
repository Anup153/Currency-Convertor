
package currency.converrtor;

import java.util.InputMismatchException;
import java.util.Scanner;



public class CurrencyConverrtor {

    public static void main(String[] args) {
        try {
            System.out.println("1 Rupee");
            System.out.println("2 Dollar");
            System.out.println("3 Euro");
            System.out.println("4 Taka");

            
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the source currency");
            int sourceCurrency = sc.nextInt();

            
            System.out.println("Enter the amount");
            double amount = sc.nextDouble();

            // take input for destination currency
            System.out.println("Choose the destination currency");
            int destCurrency = sc.nextInt();

            // convert the amount
            convertCurrency(sourceCurrency, destCurrency, amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        }
    }

    public static void convertCurrency(int sourceCurrency, int destCurrency, double amount) {
        try {
            switch (sourceCurrency) {
                case 1:
                    Rupee_to_other(destCurrency, amount);
                    break;
                case 2:
                    Dollar_to_other(destCurrency, amount);
                    break;
                case 3:
                    Euro_to_other(destCurrency, amount);
                    break;
                case 4:
                    Taka_to_other(destCurrency, amount);
                    break;
                default:
                    System.out.println("Invalid source currency choice");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error during conversion. Please check your input values.");
        }
    }

    public static void Rupee_to_other(int destCurrency, double amt) {
        try {
            switch (destCurrency) {
                case 1:
                    System.out.println(amt + " Rupee = " + amt + " Rupee");
                    break;
                case 2:
                    System.out.println(amt + " Rupee = " + (amt * 0.012) + " Dollar");
                    break;
                case 3:
                    System.out.println(amt + " Rupee = " + (amt * 0.011) + " Euro");
                    break;
                case 4:
                    System.out.println(amt + " Rupee = " + (amt * 1.32) + " Taka");
                    break;
                default:
                    System.out.println("Invalid destination currency choice");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error during conversion. Please check your input values.");
        }
    }

    public static void Dollar_to_other(int destCurrency, double amt) {
        try {
            switch (destCurrency) {
                case 1:
                    System.out.println(amt + " Dollar = " + (amt * 83.31) + " Rupee");
                    break;
                case 2:
                    System.out.println(amt + " Dollar = " + amt + " Dollar");
                    break;
                case 3:
                    System.out.println(amt + " Dollar = " + (amt * 0.91) + " Euro");
                    break;
                case 4:
                    System.out.println(amt + " Dollar = " + (amt * 109.89) + " Taka");
                    break;
                default:
                    System.out.println("Invalid destination currency choice");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error during conversion. Please check your input values.");
        }
    }

    public static void Euro_to_other(int destCurrency, double amt) {
        try {
            switch (destCurrency) {
                case 1:
                    System.out.println(amt + " Euro = " + (amt * 91.23) + " Rupee");
                    break;
                case 2:
                    System.out.println(amt + " Euro = " + (amt * 1.09) + " Dollar");
                    break;
                case 3:
                    System.out.println(amt + " Euro = " + amt + " Euro");
                    break;
                case 4:
                    System.out.println(amt + " Euro = " + (amt * 120.37) + " Taka");
                    break;
                default:
                    System.out.println("Invalid destination currency choice");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error during conversion. Please check your input values.");
        }
    }

    public static void Taka_to_other(int destCurrency, double amt) {
        try {
            switch (destCurrency) {
                case 1:
                    System.out.println(amt + " Taka = " + (amt * 0.76) + " Rupee");
                    break;
                case 2:
                    System.out.println(amt + " Taka = " + (amt * 0.0091 ) + " Dollar");
                    break;
                case 3:
                    System.out.println(amt + " Taka = " + (amt * 0.0083) + " Euro");
                    break;
                case 4:
                    System.out.println(amt + " Taka = " + amt + " Taka");
                    break;
                default:
                    System.out.println("Invalid destination currency choice");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error during conversion. Please check your input values.");
        }
    }
}

1