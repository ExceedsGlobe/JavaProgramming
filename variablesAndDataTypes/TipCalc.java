package variablesAndDataTypes;
/*
* We would like to give tip 20% of what we get change
* */
public class TipCalc {
    public static void main(String args[]){
    int paid=500;
    int billAmt=375;
    //formula to calculate percentage
    double tip=(paid-billAmt)*0.20;
    //Display the variable value
    System.out.println("The tip should be "+tip);
    }
}

