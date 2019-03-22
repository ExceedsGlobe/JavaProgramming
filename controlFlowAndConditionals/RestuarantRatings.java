package controlFlowAndConditionals;

public class RestuarantRatings {
    public static void main(String args[]){
        int rating=4;
        String message="";
        if (rating>=4){
            message="Thank you!";
        }else if (rating==3){
            message="Hope you give us another chance";
        }else if (rating<=2){
            message="Please let us know what happend";
        }
        System.out.println(message);
    }
}
