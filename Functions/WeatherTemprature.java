package Functions;
//Prints the status of the temprature based on numbers
//Program that uses the concept of functions with parameters

public class WeatherTemprature {
    public static void main(String ag[]){
        WeatherTemprature obj=new WeatherTemprature();
        //Calling the function
        obj.weatherInterpreter(13);
    }
    /*Prints the temprature status
     *@param 1st temprature to be passed
     *  */
    public void weatherInterpreter(int temp){
        String condition="";
        if (temp>30){
            condition="Too hot!";
        }else if (temp<=10){
            condition="Too cool!";

        }else{
            condition="Nor Too hot nor too cold!";

        }
        System.out.println(condition);
    }
}
