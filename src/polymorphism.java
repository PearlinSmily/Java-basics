class Pets{

}
    class Pig extends Pets {
        {
            System.out.println("The pig says: wee wee");
        }
    }
    class Dog extends Pets {
        {
            System.out.println("The dog says: bow wow");
        }
    }
    public class Pets {
        {
            System.out.println("The animal makes a sound");
        }

        public static void main(String[] args) {
            Pets myAnimal = new Pets();
            Pets myPig = new Pig();
            Pets myDog = new Dog();

        }
    }

