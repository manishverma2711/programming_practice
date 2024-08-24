public class max_array_multidimensional {

    public static void main(String[] args) {

        int xyz[][] ={{12,25,3},{25,26,2},{656,268,89}};

        int max = xyz[0][0];

        for (int i=0; i<3;i++){

            for (int j=0;j<3;j++){

                if (max<xyz[i][j]){

                    max=xyz[i][j];
                }
            }
        }
        System.out.println("The largest element present in the array is: " +max);
    }
}
