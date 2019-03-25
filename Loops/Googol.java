package Loops;

public class Googol {
    //This program contains 100 '0's
    public static void main(String args[]){
        String googol="1";
        int size=googol.length();
        //Exits loop when the String length is 101
        while(size<=100){
            googol=googol+"0";
            size=googol.length();
        }
        System.out.println(googol);
        System.out.println(size);
    }
}
