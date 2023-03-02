package Week3;


import java.util.*;

public class SwitchCase {
    //User will enter a name and then check the name and write in the console.

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter the name : ");
        String name =  scanner.nextLine();

        switch (name){
            case "Vitaly" :
                System.out.println("You have entered " + name);
                break;
            case "Mustafa" :
                System.out.println("You have entered " + name);
                break;
            case "Ramazan" :
                System.out.println("You have entered " + name);
                break;
            case "Katrina" :
                System.out.println("You have entered " + name);
                break;
            default :
                System.out.println("please enter your valid name.");
        }
    }
}
