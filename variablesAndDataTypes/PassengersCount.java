package variablesAndDataTypes;
/*
* This program demonstrates the
*
* */
public class PassengersCount {
    public static void main(String args[]){
        //Declare a variable
        int passengers;
        int stop=0;
        //Initializing a variable
        passengers=0;
        //Updating the variable value
        passengers=+3;
        //Keeping the track of bus stops
        stop=stop+1;
        //Displaying the variable value
        System.out.println("People in Bus stop "+stop+": "+passengers);


        passengers=passengers+4;
        stop=stop+1;
        System.out.println("People in Bus stop "+stop+": "+passengers);


        passengers=(passengers-1)+3;
        stop=stop+1;

        System.out.println("People in Bus stop "+stop+": "+passengers);




    }
}
