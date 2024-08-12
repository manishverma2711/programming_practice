import java.util.Scanner;

public class vowels_by_containmethod {
    public static void main(String[] args) {

        System.out.println("Enter a string :");
        Scanner sc =new Scanner(System.in);
        String convert= sc.nextLine();

        String str = convert.toUpperCase();

        if (str.contains("A") || str.contains("E") || str.contains("I") || str.contains("O") || str.contains("U")) {

            System.out.println("The string contains the vowels.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }





    }
}
