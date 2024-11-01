import java.util.Scanner;

public class IT24103874Lab3Q3{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Rupee amount: ");
    int amount = input.nextInt();

    //Calculations
    System.out.println("");
    int n5K = amount/5000;
    amount = amount%5000;
    int n1K = amount/1000;
    amount = amount%1000;
    int n5h = amount/500;
    amount = amount%500;
    int n2h = amount/200;
    amount = amount%200;
    int n1h = amount/100;
    amount = amount%5000;
    int n50 = amount/50;
    amount = amount%50;
    int n20 = amount/20;
    amount = amount%20;
    int n10 = amount/10;
    amount = amount%10;
    int n5 = amount/5;
    amount = amount%5;
    int n2 = amount/2;
    amount = amount%2;
    int n1 = amount/1;
    amount = amount%1;

    //printing
    System.out.println("5000:  " + n5K);
    System.out.println("1000:  " + n1K);
    System.out.println("500 :  " + n5h);
    System.out.println("200 :  " + n2h);
    System.out.println("100 :  " + n1h);
    System.out.println("50  :  " + n50);
    System.out.println("20  :  " + n20);
    System.out.println("10  :  " + n10);
    System.out.println("5   :  " + n5);
    System.out.println("2   :  " + n2);
    System.out.println("1   :  " + n1);

    }
}