public class capsule {

        public String name;
        private int age;
        public String emailid;

        public String getName() {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        private int getAge ()
        {
            return age;
        }
        private void setAge ( int age)
        {
            this.age = age;
        }
        private String getEmailid () {
            return emailid;
        }
        private void setEmailid (String emailid)
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