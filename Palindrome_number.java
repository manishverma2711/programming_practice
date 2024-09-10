import java.util.Scanner;

public class Palindrome_number {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int Original= number;

        int reminder =0;

        int rev = 0;


      while (number!=0){

          reminder = number %10;
          rev= (rev * 10) + reminder;
          number = number/10;
      }

        System.out.println("The reverse of the actual number is: " + rev);

      if (Original==rev){

          System.out.println("its a palindrome number: ");
      }
      else {

          System.out.println("Its non-palindrome number: ");
      }

    }
}
