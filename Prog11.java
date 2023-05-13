//Este programa imprime los numeros del 1 al 10 con su factorial al frente con until
import java.io.*;
public class Prog11
{
    public static void main (String args [])
    {
        int n,f;
        n=0;
        f=1;
        do
        {
            n++;
            f=f*n;
            System.out.println(""+n+"    "+f);
        }while (n<10);
    }
    
}
