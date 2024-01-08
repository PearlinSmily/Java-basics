import java.util.HashSet;
import java.util.*;
    public class tree {
        public static void main(String[] args) {
            TreeSet<String> fruites = new TreeSet<String>();
            fruites.add("apple");
            fruites.add("mango");
            fruites.add("grapes");
            fruites.add("guva");
            fruites.add("pineapple");
            Iterator<String> a = fruites.iterator();
            for (String i:fruites)
            {
                System.out.println(i);
            }
        }
    }

