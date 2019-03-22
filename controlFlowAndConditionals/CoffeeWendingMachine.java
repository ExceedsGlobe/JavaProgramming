package controlFlowAndConditionals;

public class CoffeeWendingMachine {
    public static void main(String args[]){
        int passcode=555;
        String drink="";
        switch (passcode){
//Goes to the next one
            case 555:
                drink="Coffee";
                break;
            case 386:
                drink="Black coffee";
                break;
            case 123:
                drink="Tea";
                break;
                //If none of the cases satisfies
            default:
                drink="Invalid choice";
                break;
        }
        //Print the drink
        System.out.println(drink+"....");

    }
}
