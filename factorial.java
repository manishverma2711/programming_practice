import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        System.out.println("Enter a number :");
        Scanner dc = new Scanner(System.in);
        int n = dc.nextInt();
        int fact=1;

        for (int i=1; i<=n; i++)
        {
            fact = fact*i;
        }

        System.out.println("The factorial of "+ n + " is a :" + fact);



    }

}
