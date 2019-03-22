package variablesAndDataTypes;

public class StringOperations {
    public static void main(String[] a){
      String fname;
      String lname;
      String fullname;
        fname="Shahrukh";
        lname="khan";
//Combining Strings
        fullname=fname.concat(" "+lname);

        System.out.println("The full name is "+fullname);
        System.out.println("The Short name is "+fullname.substring(0,3));
        System.out.println("Length of the name is "+fullname.length());
        System.out.println("Name is uppercase " +fullname.toUpperCase());
        System.out.println("Name is lowercase " +fullname.toLowerCase());


    }
}
