import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaIntro {

    public static void main(String[] args) {
        /*
        ArrayList<Integer> someArray = new ArrayList<Integer>(new Array);
        someArray.add(4);
        someArray.add(5);
        someArray.add(-4);
        int biggest = someArray.get(0);
        for (int i = 1; i < someArray.size(); i++) {
            if (someArray.get(i) > biggest) {
                biggest = someArray.get(i);
            }
        }
        System.out.println(biggest);
        System.out.println(sumOf(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))));
        */
    }
    /*

    public static int sumOf(List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    static void smartCasting() {

        Object word = "Hello World";

        if (word instanceof String) {
            System.out.println(word.length()); //error: cannot resolve method length()
            System.out.println(((String) word).length());

        } else {
            System.out.println("Word is not of type String!");
        }
    }
    */

}

