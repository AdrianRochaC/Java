//Este programa imprime la tabla del 4 con until
import java.io.*;
public class Prog14
{
    public static void main (String args [])
    {
        int n,a;
        n=0;
        a=0;
        do
        {
            n++;
            a=n*4;
            System.out.println(""+4+"   "+n+"   "+a);
        }while(n<10);
    }
    
}
