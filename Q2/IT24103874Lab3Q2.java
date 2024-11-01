import java.util.Scanner;

public class IT24103874Lab3Q2{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the monthly salary: ");
    double salary = input.nextDouble();

    System.out.print("Enter the number of OT hours: ");
    double hours = input.nextDouble();

    System.out.print("Enter the OT hourly rate: ");
    double rate = input.nextDouble();

    System.out.println("");
    double increment = hours * rate;
    double total = increment + salary;
    System.out.println("The total salary including OT is: " + total);
    }
}