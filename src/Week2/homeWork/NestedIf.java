package Week2.homeWork;

public class NestedIf {
    public static void main(String[] args){

      boolean male = false;
      int age = 30;

      if(male){
          if( age < 20){
              System.out.println("Boy");
          }else{
              System.out.println("Man");
          }
      }
    }
}
