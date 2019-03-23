package Functions;
//Program that uses the concept of functions with parameters
public class Greetings {
    public static void main(String args[]){
        Greetings obj=new Greetings();
//Calling the function
        obj.printGreeting("Shiraz");
    }
/*Prints the greeting message with the name
*@param 1st name to be printed in the greeting
 *  */
    public void printGreeting(String name){
        System.out.println("Hello "+name);
        System.out.println("Welcome to tutorials of java");
        System.out.println("Best of luck");
    }
}
