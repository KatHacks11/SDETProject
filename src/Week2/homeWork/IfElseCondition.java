package Week2.homeWork;

public class IfElseCondition {
    public static void main(String[] args){

        int number = -1;

        if(number>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("The number s not positive");
        }



        String weather = "rainy";

        if(weather == "winter"){
            System.out.println("Nice, I hate winter");
        }
        else if (weather == "summer") {
            System.out.println("oh I love summer");
        } else if (weather == "rainy") {
            System.out.println("you got it  right!! Rainy today");
        }
        else{
            System.out.println("Guess again");
        }

        System.out.println("It will run anyway");
    }
}
