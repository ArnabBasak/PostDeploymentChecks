import java.io.*;

 
public class SerializeDemo 
{
   public static void main(String[] args)
   { 
      Employee e = new Employee(); 
      e.name ="Dilip Ahuja"; 
      e.address ="Link Road, Mumbai"; 
      e.SSN =11122333; 
      e.number =101; 
      try 
      { 
           FileOutputStream fileOut = new FileOutputStream("employee.ser"); 
          ObjectOutputStream out= new ObjectOutputStream(fileOut); 
          out.writeObject(e); 
          out.close(); 
          fileOut.close(); 
      }
      catch(IOException i) 
      {
           i.printStackTrace(); 
      } 
    } 
}
