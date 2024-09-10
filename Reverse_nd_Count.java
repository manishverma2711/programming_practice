import java.util.Scanner;

public class Reverse_nd_Count {

    public static void main(String[] args) {

        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >=0; i--) {

            rev = rev + str.charAt(i);
        }

        System.out.println("The reverse of the given number is: " +rev);

        for (int i=0;i<rev.length();i++){

            System.out.println(i +":"+rev.charAt(i));
        }


    }
}