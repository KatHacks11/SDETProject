package Week2.homeWork;

import java.util.Locale;

public class NonPrimativeDataType {

    public static void main(String[] args){

        String name = "Katrina";
        System.out.println("0005 name: " + name);
        System.out.println("Name length: " + name.length());
        System.out.println("name frog: " + name.toLowerCase());


        /**
         * Java counts position from zero.
         * 0 is the first position in a string, 1 is the second, 2 is the third...
         * if there is no such a text, its goini to return -1
         */
        System.out.println("=========================================================");
        String txt= "Clarusway SDET Course";
        System.out.println(txt);

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println("This is the first s index number of txt variable:" + txt.indexOf("s"));
        System.out.println("This is the first index of 'way' word" + txt.indexOf("way"));

        txt ="Live Class 2023";

        System.out.println(txt);

    }
}
