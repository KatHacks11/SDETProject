package Week3;

import java.io.OutputStream;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary operator syntax
        //expression1 ? expression2 : expression3
        // Nested Ternary operator (Expression1 ? (Expression2 ? Expression 6: Expression7) : (Expression3 ? Expression4 : Expression5))
        //condition_is_correct ? result1 : accept_results2

        int a = 4;
        if(a > 3){
            System.out.println("A is greater");
        } else{
            System.out.println("A is greater");
        }

        String result;
        result = a > 3 ? "A is greater" : "A is smaller";
        System.out.println(result);
        System.out.println(a > 3 ? "A is greater" : "A is smaller");

        //math >= 45 and the math < 68  --> MathGrade : D("your grade is D" otherwise  "We didn't find your grade")
        int math = 55;
        String mathGrade = (math >= 45 && math <60) ? "Your Math subject grade is D." : "We didn't find your grade.";

        int b,c,d;
        b = 3;
        c = 4;
        d = 1;
        String biggest = (d>=b) ? ((d>=c) ? "d is the biggest." : "C is the biggest") : ((b>=c) ? "b is the biggest." : "c is the biggest");
        if(d>=b){
            if(d>=c){
                System.out.println("d is biggest.");
                     }else System.out.println("c is the biggest");
            }else if (b>=c){
                System.out.println("b is the biggest.");
            }else {
                System.out.println("c is the biggest.");
            }
    }



}
