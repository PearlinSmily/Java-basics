import java.io.FileInputStream;
public class filein {
    public static void main(String[] args)
    {
        try{
            FileInputStream fin=new FileInputStream("D:filein.txt");
            int i;
            while ((i = fin.read()) != -1)
                System.out. println((char) i);
            fin.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        }
    }
