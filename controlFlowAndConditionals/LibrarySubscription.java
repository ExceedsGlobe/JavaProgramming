package controlFlowAndConditionals;

public class LibrarySubscription {
    public static void main(String args[]){
      boolean isStudent=true;
        int age=60;
        //The default fees is 250
        int subscription=250;

        //Using of logical operators
        if (age<=15||isStudent||age>60){
            subscription=150;

        }
        System.out.println("The subscription is ₹"+subscription);
    }
}
