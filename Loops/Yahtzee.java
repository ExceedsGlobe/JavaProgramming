package Loops;



public class Yahtzee {
    public static void main(String args[]){
        Yahtzee obj=new Yahtzee();
        //Calling the funcations storing the results
       int noOfrolls=obj.keepRolling();
        System.out.println("You won in "+noOfrolls+" chances");
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
    /*Rolls the dices until both have equal numbers
    * */
    public int keepRolling(){
        int count=1;
        //Calling the functions roll
        int dice1=roll();
        int dice2=roll();
//Roll the dices until both have equal numbers
        while(!(dice1==dice2)){
            dice1=roll();
            dice2=roll();
            count=count+1;
            System.out.println("Chance no "+count+"-"+dice1+" : "+dice2);
        }
        //Return count
        return count;
    }
}
