import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample1 {
    public static void main(String[] args) {
        String[] fruits= new String[3];
        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "mango";

        System.out.println(fruits[0]);

        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("orange");
        fruitsList.add("mango");
        fruitsList.add("watermelon");
        fruitsList.remove(fruitsList.size()-1);
        fruitsList.remove("orange");
        System.out.println(fruitsList.contains("mango"));
        System.out.println(fruitsList);
    }



}
