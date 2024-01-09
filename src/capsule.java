public class capsule {

        private String name;
        private int age;
        private String emailid;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
        public int getAge ()                                                  //
        {
            return age;
        }
        public void setAge ( int age)
        {
            this.age = age;
        }
        public String getEmailid () {
            return emailid;
        }
        public void setEmailid (String emailid)
        {
            this.emailid = emailid;
        }

    public static void main(String[] args)
    {
        capsule cap=new capsule();
        cap.setName("Smily");
        cap.setAge(24);
        cap.setEmailid("pearlin@gmail.com");
        System.out.println(cap.getName()+" "+cap.getAge()+" "+cap.getEmailid());
    }
}