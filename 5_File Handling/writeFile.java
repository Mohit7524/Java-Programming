import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args)
    {
        try
        {
        FileWriter objWrite=new FileWriter("First.txt");
        objWrite.write("This is First Line !:");
        objWrite.close();
        System.out.println("Data is present inside the File.txt file !");
        }
        catch (IOException e)
        {
        System.out.println("Something went to wrong");
        //e.printStackTrace();
        }
    }
    
}
