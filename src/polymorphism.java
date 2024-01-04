class Animal {
    {
        System.out.println("Sounds");                       //super class
    }
}

    class Pig extends Animal {
        {
            System.out.println("The pig says: wee wee");    //subclass
        }
    }

    class Dog extends Animal {
        {                                                   //subclass
            System.out.println("The dog says: bow wow");
        }
    }

class pets {
    public static void main(String[] args) {

        Animal myPig = new Pig();
        Animal myDog = new Dog();

    }
}
