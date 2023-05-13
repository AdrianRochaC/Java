//Este programa imprime los numeros de 1 a 1000 con su cuadrado al frente con FOR
import java.io.*;
public class Prog9
{
    public static void main (String args [])
    {
        int n,c;
        n=0;
        c=0;
        for (n=1; n<=1000; n++)
        {
            c=n*n;
            System.out.println(""+n+"     "+c);
        }
    }
    
}
