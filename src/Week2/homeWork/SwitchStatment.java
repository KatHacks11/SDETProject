package Week2.homeWork;

public class SwitchStatment {
    public static void main(String[] args){

        int dayOfWeek = 4;

        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //else
                System.out.println("If none of the case matches, This will run");


        }
    }
}
