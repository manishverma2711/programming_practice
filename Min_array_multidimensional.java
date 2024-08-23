public class Min_array_multidimensional{

    public static void main(String[] args) {

        int xyz[][] ={{12,25,3},{25,26,2},{65,268,89}};

        int min = xyz[0][0];

        for (int i=0; i<3;i++){

            for (int j=0;j<3;j++){

                if (min>xyz[i][j]){

                    min=xyz[i][j];
                }
            }
        }
        System.out.println("The Smallest element present in the array is: " +min);
    }

}
