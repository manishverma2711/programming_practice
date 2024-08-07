public class Array_Max {

    public static void main(String[] args) {

        int axe[]= {25,26,32,46,555,6446};

        int min = axe[0];

        for ( int i=0;i<axe.length;i++){

            if (min < axe[i])
            {
                min=axe[i];
            }

        }
        System.out.println("The Maximum value in array is the :" + min);
    }

}
