//Este programa imprime los numeros del 1 al 100 y al final su sumatoria con until
import java.io.*;
public class Prog5 
{
    public static void main(String args [])
    {
        int n,s;
        n=0;
        s=0;
        do
        {
            n++;
            s=s+n;
                    System.out.println(n);
        }while (n<100);
        System.out.println(s);
    }
    
}