import java.io.IOException;
import java.util.Scanner;
import java.io.File;;

public class Readfile {
    public static void main(String[] args)
    {
        try
        {
        File myObj=new File("First.java");
        Scanner sc=new Scanner(myObj);
        while(sc.hasNextLine())
        {
            String data=sc.nextLine();
            System.out.println(data);
        }
        sc.close();

        }
        catch (IOException e)
        {
            System.out.println("Sometings went to wrong");
        }


    }
    
}
