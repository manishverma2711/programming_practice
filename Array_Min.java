public class Array_Min {

    public static void main(String[] args) {

        int axe[] = {20,26,28,3035,26};

        int Min = axe[0];

        for (int i=0;i<axe.length;i++){

            if ( Min > axe[i]){

                Min = axe[i];
            }
        }

        System.out.println("The Minimum value in the array is: " + Min);
    }


}
