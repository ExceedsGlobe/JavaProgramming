package Functions;
//Program that uses the concept of functions with parameters

public class Rollercoaster {
    public static void main(String ag[]){
        Rollercoaster obj=new Rollercoaster();
        obj.checkHeight(130);
    }
    /*Prints if the person is eligible for the ride or not
     *@param 1st height to be passed
     *  */
    protected void checkHeight(int height){
        String message="";
        if (height<=120){
            message="Not allowed";
        }else{
            message="Please get on the ride!";
        }
        System.out.println(message);
    }
}
