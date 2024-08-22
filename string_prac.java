public class string_prac {

    public int age(int a){
        System.out.println("Enter a number:" + a );
        return a;
    }
    public int age(int a,int b){
        System.out.println("Enter a number:" + a +":"+ b);
        return b+b;
    }
    public String age(String c){
        System.out.println("The given String is :" + c);
        return c;
    }


    public static void main(String[] args) {

        string_prac ref = new string_prac();
        ref.age(10,20);
        ref.age("Test");
    }
}
