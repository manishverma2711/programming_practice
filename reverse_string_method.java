import java.util.Scanner;

public class reverse_string_method {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");

        Scanner sc = new Scanner(System.in);

        String check = sc.nextLine();

        StringBuffer str = new StringBuffer(check);

        System.out.println("The reverse of the string is :"+str.reverse());
    }
}
