import java.util.ArrayList;
import java.util.List;

public class Array_list {

    public static void main(String[] args) {

        List<String> a = new ArrayList<String>();

      a.add("Manish");
      a.add("Sandeep");
      a.add("Champ");

        System.out.println("The second array is: " + a.get(1));

        System.out.println(a.size());


    }
}
