 class inheritance {                                                     //super class
    String studname ="smily";
    int age =24;
    {
        System.out.println("---student details---");
    }
}
class details extends inheritance {                                          //subclass
    int total = 545;

    public static void main(String[] args) {
        details sd = new details();
        System.out.println(sd.studname + " " + sd.age + " " + sd.total);
    }
}