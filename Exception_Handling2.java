import java.io.*;
public class Exception_Handling2
{
   static void readFile() throws IOException
    {
        FileReader text = new FileReader("Prime.java");
        System.out.println("File Opened");
    }
public static void main(String[] args) 
{
    try {
        readFile();
    } catch (IOException e) {
        System.out.println("Something went Wrong");
    }  
}
}