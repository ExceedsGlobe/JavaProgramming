package controlFlowAndConditionals;

public class SelfDrivingCar {
    public static void main(String args[]){
        boolean isLightGreen=false, isLightYellow=true;
        if (isLightGreen){
            //If the condition satisfies
            System.out.println("Drive!");
        }
        else if (isLightYellow){
            //If the above condition satifies
            System.out.println("Slow down!");
        }
        else{
            //if the IF condition is not true
            System.out.println("Stop!");
        }
    }
}
