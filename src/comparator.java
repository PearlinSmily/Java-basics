
import java.util.*;
    class Studen {                                             //class 1
        int rollno;
        String name;
        public Studen(int rollno, String name)   //constructor
        {
            this.rollno = rollno;
            this.name = name;
        }
        public String toString()
        {
            return this.rollno + " " + this.name;
        }
    }
    class Sortbyroll implements Comparator<Studen> {           //class 2    comparator interface
        public int compare(Studen a, Studen b)                 //comparing
        {
            return a.rollno - b.rollno;
        }
    }
public class comparator {
        public static void main(String[] args) {
        ArrayList<Studen> stud = new ArrayList<Studen>();

        stud.add(new Studen(001, "Smily"));
        stud.add(new Studen(004, "Blessy"));
        stud.add(new Studen(002, "Jerwin"));
        stud.add(new Studen(003, "Ronald"));
            System.out.println("Students List (Before Sorting):");
            for (Studen student : stud) {
                System.out.println(student);
            }
            Collections.sort(stud, new Sortbyroll());
            System.out.println("\nStudents List (After Sorting by Roll Number):");
            for (Studen student : stud) {
                System.out.println(student);
            }
        }
}
