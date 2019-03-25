package Loops;

public class FruitStall {
    public static void main(String args[]){
        //List of fruits
        String[] fruits={"Apple","Orange","Grapes","Litchi","mango","banana"};
        int noOfFruits=fruits.length;
        //Returns a floating number
        double randomNo=Math.random()*noOfFruits;
        //Cast to int
        int pick=(int)randomNo;
        //Every picks a random fruit
        System.out.println("I'm eating "+fruits[pick]);
    }
}
