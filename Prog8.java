//Este programa imprime los numeros del 1 al 1000 y en frente su cuadrado con until
import java.io.*;
public class Prog8 
{
    public static void main (String args [])
    {
        int n,c;
        n=0;
        c=0;
        do
        {
            n++;
            c=n*n;
            System.out.println(""+n+"     "+c);
        }while (n<1000);
    }
    
}
