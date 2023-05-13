//Este programa imprime los numeros de 1 a 100 y al final su sumatoria con FOR
import java.io.*;
public class Prog6 
{
    public static void main (String args[])
    {
        int n,s;
        n=0;
        s=0;
        for (n=1; n<=100; n++)
        {
            s=s+n;
            System.out.println(n);  
        }
        System.out.println(s);
    }
    
}
