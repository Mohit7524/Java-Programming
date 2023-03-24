import java.io.File;
import java.io.IOException;

public class Handling {
    public static void main(String[] args)
    {
    try
    {
        File objFile=new File("First.txt");
        if(objFile.createNewFile()){
            System.out.println("File created: "+ objFile.getName());
        }
        else{
            System.out.println("File already exists");
        }
        }
        catch (IOException e) {
            System.out.println("Error Occoured");
            e.printStackTrace();



        }  
    }
}

