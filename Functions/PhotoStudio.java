package Functions;
//Program that uses the concept of functions with multiple parameters
public class PhotoStudio {
public static void main(String args[]){
PhotoStudio obj=new PhotoStudio();
obj.photoType(15,8,false);
}
/*
* Prints out the information of the photo as per arguments passed
* @param 1st height in cms
* @param 2nd width in cms
* @param 3rd color or black&white boolean
* */
   public void photoType(int height,int width,boolean isColor){
    System.out.println("The height of the photot is "+height+" cm");
    System.out.println("The width of the photot is "+width+" cm");
    if (isColor){
        System.out.println("This is a color photo");

    }else{
        System.out.println("This is a black and white photo");
    }

}}
