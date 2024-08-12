import java.util.Arrays;

public class vowels {

    public static void main(String[] args) {

        String charachter = "Manish";

        String convert = charachter.toUpperCase();

        String str = "";

         int vowels = 0, cons=0;


        for (int i = 0; i < convert.length(); i++) {

            char ch = convert.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } else if (ch >= 'A' && ch <= 'Z') { // Ensuring that only letters are counted as consonants
                cons++;
            }
        }
        System.out.println("The vowels count in the string is: " + vowels);
        System.out.println("The consonants count in the string is: " + cons);


        }

    }

