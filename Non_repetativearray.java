public class Non_repetativearray {

    public static void main(String[] args) {

        int num[]={20,26,30,20,26,30,12};

        int intiial = num[0];

        for (int i=1; i<num.length; i++){

            intiial = intiial ^ num[i];
        }

        System.out.println("The non-repeatative number in array is : " + intiial);
    }
}
