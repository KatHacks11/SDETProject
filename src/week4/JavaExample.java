package week4;

public class JavaExample {
    //static variables(beloongs to class)
    static int i = 100;
    static String s = "Beginnersbook";
    //instance variables (belongs to object)
    String name = "Katrina";
    //static method
    static void display(){
        //We can only call sttic varibles form static methods.
        System.out.println("i : " + i);
        System.out.println("s : " + s);
    }
    //non-static method
    void funcn(){
        //static method can call in static method s
        display();
    }
    //static main method
    public static void main(String[] args) {
        System.out.println("i : " + i);
        System.out.println("s : " + s);
        //create an object from JavaExmple class.
        JavaExample javaExample = new JavaExample();
        //we are calling an instance variable through the object
        System.out.println(javaExample.name);
        //we need to call non-static method through the object
        javaExample.funcn();

        display();//we can call static method directly from statis method

        //funcn();--> we can not call non-static methods from static method
    }
}
