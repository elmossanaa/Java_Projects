import java.io.*;
import java.util.Scanner;

public class Choosing_Locations{

  public static void main(String[] args) throws IOException{
    String filename;
    String Location;
    int numLocation;

    Scanner L = new Scanner(System.in);
        
        System.out.println("How many favorite locations do you have in mind? ");
        numLocation = L.nextInt();
        L.nextLine();
        
        System.out.println("Please enter the filename: ");
        filename = L.nextLine();
        
        //open the file
        PrintWriter choose = new PrintWriter(filename);
        
        // Get data and write it to the file.
        for(int c =1; c<=numLocation;c++){
            
            System.out.println("enter the name of your favorite location number " + c +":");
            Location = L.nextLine();
            
            choose.println(Location);
            
        }
        choose.close();
        System.out.println("Data has been written to file.");


    
  }

}
