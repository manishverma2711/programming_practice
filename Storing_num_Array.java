import java.util.Scanner;

public class Storing_num_Array {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] num = new int[size];


        for (int i=0;i<size;i++){

            System.out.println("Enter element" + (i + 1)+ " :");
            num[i] = sc.nextInt();
        }

        System.out.println("You Entered :");
        for (int i=0; i< size; i++){
            System.out.println("Element" + (i+1) + ":" + num[i]);
        }


        sc.close();
    }
}
