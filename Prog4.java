//Este programa imprime los numeros del 1 al 100 y al final su sumatoria con while
import java.io.*;
public class Prog4 
{
    public static void main(String args [])
    {
        int n,s;
        n=0;
        s=0;
        while(n<100)
        {
            n++;
            s=s+n;
                    System.out.println(n);
        }
        System.out.println(s);
    }
    
}
