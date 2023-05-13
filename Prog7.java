//Este programa imprime los numeros de 1 a 1000 y en frente su cuadrado con while
import java.io.*;
public class Prog7
{
    public static void main (String args [])
    {
        int n,c;
        n=0;
        c=0;
        while (n<1000)
        {
            n++;
            c=n*n;
            System.out.println(""+n+"    "+c);
        }
    }
    
}
