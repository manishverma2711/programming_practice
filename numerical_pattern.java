public class numerical_pattern {
    public static void main(String[] args) {

        int n=1;;

        for (int i =1; i<5;i++){

            for (int j=5;j>i;j--){

                System.out.print(" " + n);
                n++;
            }

            System.out.println(" ");
        }


    }
}