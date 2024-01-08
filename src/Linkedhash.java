
import java.util.*;
    public class Linkedhash {
        public static void main(String[] args) {
            LinkedHashSet<String> veg = new LinkedHashSet<String>();
            veg .add("apple");
            veg .add("mango");
            veg .add("grapes");
            veg .add("guva");
            veg .add("pineapple");
            Iterator<String> a = veg .iterator();
            for (String i:veg)
            {
                System.out.println(i);
            }
        }
    }

