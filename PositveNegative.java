import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PositveNegative {
    public static void main(String args[]) throws IOException
    {
        int x;
        DataInputStream dis=new DataInputStream(System.in);
         System.out.println("Enter your number:");
         x=Integer.parseInt(dis.readLine());
         if ( x > 0){
            System.out.print("Given number is positive");
         }
         else{
            System.out.print("Given number is Nagitve");
         }
    }
}
