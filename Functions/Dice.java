package Functions;
//Program that uses the concept of functions and return type

public class Dice {
    public static void main(String args[]){
        Dice obj=new Dice();
        //Calling the funcations storing the results
        int number=obj.roll();
        int number2=obj.roll();
    System.out.println("The dice roll 1 is "+number);
    System.out.println("The dice roll 2 is "+number2);
    }
   /*
   The roll operation is done with the dice when called
   * @return a number is returned randomly between 1 to 6
   * */
    public int roll(){
        double randNo=Math.random()*6;
        int result=(int)randNo+1;

        return result;
    }
}
