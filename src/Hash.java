import java.util.HashSet;
import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        for (String i:cars)
        {
            System.out.println(i);
        }
    }
}
