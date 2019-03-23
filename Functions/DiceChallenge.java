package Functions;
//Program that uses the concept of functions with multiple parameters and return type

public class DiceChallenge {
    public static void main(String args[]){
        DiceChallenge obj=new DiceChallenge();
        //Return no 1 to 8
    int number=obj.roll(8);
        //Return no 1 to 10
    int number2=obj.roll(10);
        //Return no 1 to 6
    int number3=obj.roll(6);
    System.out.println("The numer for dice 8 is "+number);
    System.out.println("The numer for dice 10 is "+number2);
    System.out.println("The numer for dice 6 is "+number3);

    }


    /*
    * This is the roll operation of Dice
    * @param int for the limit
    * @return type int returns random number based on limit
    *
    */
    public int roll(int limit){
        double randNo=Math.random()*limit;
        int result=(int)randNo+1;
        return result;
    }
}
