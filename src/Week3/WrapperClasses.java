package Week3;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInt = 9;
        Double myDouble = 11.4;
        String myChar = "@";
        String intToString;
        int num = 19;
        double dNum = 16.3;


        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        intToString = myInt.toString(); //converting form int to String
        intToString.length(); //number of intToString character --> 1

        System.out.println("Primitive value " + num);
        System.out.println("Wrapper value " + myInt);
        System.out.println(Double.max( 4.6,  11.7));// --> 11.7
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        //Unboxing
        myDouble = dNum;
        System.out.println(myDouble);

        //Autoboxing
        dNum = myDouble;
        System.out.println(dNum);

        //Parsing converts String value to the primitive types.
        String number = "1234";
        System.out.println(number + 6);//Error or 12346
        System.out.println(6 + number);
        short sNum = (short) dNum;
        int  numberValue = Integer.parseInt(number);

    }
}
