package Functions;
//Program that uses the concept of functions with multiple parameters and return type

public class CalculateChange {
    public static void main(String args[]){
        CalculateChange obj=new CalculateChange();
        double change=obj.makeChange(4000,3786.80);
        //Display the result returned
        System.out.println("The change is "+change);

    }
    /*
    * Calulates the balance amoutn
    * @param 1st amount paid by customer int
    * @param 2nd bill amount double
    * @return change to be provied
    * */
   public double makeChange(int paid,double billAmt){
        double change=paid-billAmt;
        return change;
    }
}
