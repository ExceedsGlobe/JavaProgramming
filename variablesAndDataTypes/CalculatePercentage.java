package variablesAndDataTypes;

public class CalculatePercentage {
    public static void main(String args[]){
       //Subjects
        double dbms=80;
       double c=78;
       double dataStruc=89;
       double cGraphics=67;
       double maths=74;

       double total;
        //total marks
       total=dbms+c+dataStruc+cGraphics+maths;
//Formula
       double percentage=total/5;


        System.out.println("Percentage "+percentage+"%");
    }
}
