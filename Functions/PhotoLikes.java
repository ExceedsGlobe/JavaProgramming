package Functions;
//Program that uses the concept of functions with multiple parameters and return type

public class PhotoLikes {
    public static void main(String ag[]){
PhotoLikes obj =new PhotoLikes();
//Calling the funcations with parameters and storing the results
int getLikes=obj.getCurrentLikes(12,false,"Nice!");
//Display the result returned by function
System.out.println("Total likes "+getLikes);
    }
    /*
     * Checks if the photo is liked and increments the likes
     * @param 1st currentLikes in int
     * @param 2nd isLiked in boolean
     * @param 3rd String comment
     * @return type returns the likes but doing the calculations
     * */
public int getCurrentLikes(int currentLikes,boolean liked,String comment){
        int count=currentLikes;//12
        if (liked==true){
            count=count+1;
        }
System.out.println("Comment : "+comment);

        return count;
}
}
