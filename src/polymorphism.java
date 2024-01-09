
class Method {
    void min(int a, int b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    void min(int a, int b, int c) {
        if (a < b) {
            System.out.println(a);
        } else if (b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    class polymorphism {
        public static void main(String[] args) {
            Method obj1 = new Method();
            obj1.min(2, 6);
            obj1.min(7, 9, 2);
        }
    }
}