package Functions;

public class MusicCheck {
    public static void main(String ag[]){
       //Creating the object
        MusicCheck obj=new MusicCheck();
        //Calling the function with object
        obj.isMusicOn();
    }
    /*
    Prints message depending on if the playButton in on or off
    * */
    public void isMusicOn(){
        boolean isPlayButtonOn=true;
        if(isPlayButtonOn){
            System.out.println("Music On!");

        }else{
            System.out.println("Music OFF!");
        }
    }
}
