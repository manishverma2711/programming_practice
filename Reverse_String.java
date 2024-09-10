import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {


        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String rev="";

        for (int i=str.length()-1;i>=0;i--){

            rev = rev + str.charAt(i);
        }

        System.out.println("The reverse of the string is : " + rev);
    }

}
