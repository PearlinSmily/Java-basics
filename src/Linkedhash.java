
import java.util.*;
    public class Linkedhash {
        public static void main(String[] args) {
            LinkedHashSet<String> veg = new LinkedHashSet<String>();
            veg .add("carrot");
            veg .add("beetroot");
            veg .add("potato");
            veg .add("onion");
            veg .add("beans");
            Iterator<String> a = veg .iterator();
            for (String i:veg)
            {
                System.out.println(i);
            }
        }
    }

