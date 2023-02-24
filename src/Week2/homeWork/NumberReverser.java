package Week2.homeWork;
/*
9- Write a java program to reverse a given number (user scanner class for user inputs)
input: 45678 , Output: 87654
 */
public class NumberReverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        if (number >= -9 && number <= 9 ) {
            System.out.println("Single-digit number! Can not reverse the number!" + number);
        }  else {
            String stringNumber = String.valueOf(number);
            //Solution 1 :
            int reverseNumber = 0;
            for (int i = 1; i <= stringNumber.length(); i++) {
                reverseNumber = number % 10 + (10 * reverseNumber);
                number = number / 10;
                System.out.println(reverseNumber);
            }
            String reversedNumber="";
            //Solution 2:
            for(int i =0; i < stringNumber.length(); i++){
                reverseNumber = reverseNumber + stringNumber.charAt(i);

            }
            //                  012345 ---> index number of strng
            // String string = "number"
            System.out.println("Reverse number is: " + reverseNumber);
        }
    }
}
