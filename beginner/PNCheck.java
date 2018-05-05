import java.util.*;
import java.io.*;
class PNCheck {
    public static void main(String args[])
    {
           int n;
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            if(n>0)
            {
                System.out.print("Positive");
            }
            else if(n<0)
            {
                System.out.print("Negative");
            }
            else
            {
                System.out.print("Zero");
            }
            
    }
}