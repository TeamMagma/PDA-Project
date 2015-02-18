import java.io.*;
import java.util.*;
public class PDA
{
   public static void main (String [] args)
   {
       System.out.print("Enter your age");
       Scanner kb = new Scanner(System.in);
       double a = kb.nextDouble();
       double i;
       double b;
       i = ((a / 2) + 7);     
       b = ((a-7) * 2);
       System.out.println("You should date someone older than" + i + " and younger than" + b );
       
   }
}