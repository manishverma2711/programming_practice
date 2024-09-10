import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {

        System.out.print(" Enter a string :");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String rev ="";

        for ( int i= str.length()-1;i>=0;i--){

            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

        if (str.equals(rev)){

            System.out.println(" Its palindrome string :");
        }
        else
        {
            System.out.println("Its non- palindrome string :");
        }

    }
}
