package CoreJava;

public class StringDemo {
    public static void main(String[] args) {
        String str = "hello"; // create new string
        String str1 = str; //refer to created string
        boolean isSameStrReference = (str == str1);
        System.out.println("Is str and str1 points to same location ?? " + isSameStrReference);//check if they refer to same object
        String str2 = str1.concat("World"); //creates new string in string pool
        System.out.println("Now str1 and str2 are " + str1 + " and " + str2);
    }
}
