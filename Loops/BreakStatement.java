package Loops;

public class BreakStatement {
    public static void main(String args[]){
        for (int i=1;i<=20;i++){
            //If a no is divisible by 5 and 3 ex 15
            if (i%3==0&&i%5==0){
                //Exits the loop
                break;
            }
            //This program will print till 14
            System.out.println(i);
        }
    }
}
