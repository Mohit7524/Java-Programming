import java.io.File;
import java.io.IOException;

public class GetFileInfo {
    public static void main(String[] args)
    {
       // File myObj=new File("First.txt");
        /* 
        if(myObj.exists())
        {
            System.out.println("File name is:" + myObj.getName());
            System.out.println("File readble is:" + myObj.canRead());
            System.out.println("File writable: " + myObj.canWrite());
            System.out.println("Absolute Path is : " + myObj.getAbsolutePath());
            System.out.println("File Size is in byte: " + myObj.length());

        }
        else
        {
            System.out.println("Somthing went to wrong");
        }
        */

        
        /* 
        // Delete a file
        if(myObj.delete())
        {
            System.out.println("File Deleted: " + myObj.getName());
        } 
        else
        {
            System.out.println("File is not deleted");
        }
        */

        // Delete a File Folder
        File myObj1=new File("F:\\AWS");
        if(myObj1.delete())
        {
         System.out.println("Folder Deleted :" + myObj1.getName());

        }
        else
        {
            System.out.println("Folder is not deleted yet,Please Try again!");
        }
    }
    
}
