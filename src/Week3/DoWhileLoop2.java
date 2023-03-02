package Week3;

import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        boolean passCode = false;
        int doorCode = 2025;
        int userCode= 0;
        while (passCode){
            System.out.println("Welcome to our Company, the door will be open in 2 seconds...");
            System.out.println("The door opened now");

        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the door code : ");
        userCode = scan.nextInt();
        while(doorCode == userCode){
            System.out.println("welcome to the Company...");

            /**
             * Class Name: MyHomeworkClass
             * Method Name: main()
             * Developer: <Katrina></Katrina>
             * Date: Feb 27, 2023
             */
        }
    }
}
