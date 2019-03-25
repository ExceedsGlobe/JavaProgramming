package Loops;

public class Addition {
    public static void main(String args[]){
    Addition obj=new Addition();
    int sum=obj.add(15,20);
    System.out.println(sum);
}
    /*
     * Returns a value after adding series based on limits
     * @param 1st field lowerlimit 15
     * @param 2nd field upperlimit 20
     * returns 15+16+17+18+19+20=105
      * */
    public int add(int lowerLimit,int upperLimit){
        int total=0;
        for(int i=lowerLimit;i<=upperLimit;i++){
            total=total+i;
        }
        return total;
    }
}
