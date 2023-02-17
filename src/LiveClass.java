

import java.util.Scanner;

public class LiveClass {
    public static void main(String[] args){
        int y = 10;

        int x = (y < 5) ? (2 *y) : (3 * y);

        System.out.println("X is :" + x);

        /*
        How to find the largest of 3 numbers using the nested ternary operator.
        9 - 3 - 7 --> 9
         */

        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter 3 number");

        int num1, num2, num3;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        int largest = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >=num3) ? num2 :num3);
        System.out.println("Largest number is: "+ largest);
    }


}
