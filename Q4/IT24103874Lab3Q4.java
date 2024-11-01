import java.util.Scanner;

public class IT24103874Lab3Q4{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the five-digit number: ");
    int amount = input.nextInt();

    //Calculations
    System.out.println("");
    int n1 = amount/10000;
    amount = amount%10000;
    int n2 = amount/1000;
    amount = amount%1000;
    int n3 = amount/100;
    amount = amount%100;
    int n4 = amount/10;
    amount = amount%10;
    int n5 = amount/1;
    amount = amount%1;
    

    //printing
    System.out.print(n1 + " ");
    System.out.print(n2 + " ");
    System.out.print(n3 + " ");
    System.out.print(n4 + " ");
    System.out.print(n5 + " ");

    }
}