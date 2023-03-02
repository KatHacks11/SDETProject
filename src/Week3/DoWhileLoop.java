package Week3;

public class DoWhileLoop {

    /*
        while (Condition){ condition = true
        //statement
        }

        do{ The code is going to be executed although the condition is true or false in the first time.
        //statement
        //
        //
        }while (condition); If the condition is true and do while loop will continue to execute.
     */

    public static void main(String[] args) {

        // if x < 10 add the x value to total variable. (x = 4)
        int x = 11;
        int total = 0;
        while(x<10){
            total = total + x; // total+= x
            x++;

        }
        System.out.println("Total number : " + total);

        total = 0;
        do{
            total += x;
            x++;
        }while(x<10);

        System.out.println("Total Number from do while loop : " + total);
    }

}
