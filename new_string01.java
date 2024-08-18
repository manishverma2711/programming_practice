import java.util.Scanner;

public class new_string01 {
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Split the input string into words
        String[] words = input.split(" ");

        // Create an array to store the words
        String[] men = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            men[i] = words[i];
        }

        System.out.println("You entered:");
        for (String s : men) {
            System.out.println(s);
        }


    }
}
