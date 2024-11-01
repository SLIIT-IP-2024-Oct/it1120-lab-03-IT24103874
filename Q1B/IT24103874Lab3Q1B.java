import java.util.Scanner;

public class IT24103874Lab3Q1B{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the price of 1 kg of rice: ");
    double price = input.nextDouble();

    System.out.print("Enter the number of kilograms you want to buy: ");
    double weight = input.nextDouble();

    System.out.println("");
    double total = weight * price * 0.9;
    System.out.println("The total amount with 10% discount is: " + total);
    }
}