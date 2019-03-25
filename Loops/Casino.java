package Loops;

public class Casino {
    public static void main(String args[]){
        int bal=4500;
        int minBal=500;
        while(bal>minBal){
            System.out.println(bal);
            bal=bal-300;

            if (bal<=minBal){
            //Cannot gamble if the balance is less than or equal to Minimum balance;
                break;
            }
        }
    }
}
