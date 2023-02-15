package Week2.homeWork;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("you entered: " + name);

        System.out.println("Enter two number less than 100: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();




        System.out.println("You entered two numbers, First number: " + num1+ "+ (\nSecond number:"  + num2);

        System.out.println(" The weather is cold. Please confirm if true or false");
    boolean isCold = scan.nextBoolean();
        System.out.println("The Weather is cold "+ isCold);


    }
}
