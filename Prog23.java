//Este programa imprime las tablas del 4, 5 y 6 con FOR - While
import java.io.*;
public class Prog23 
{
    public static void main (String args[])
    {
        int a,b,c;
        a=0; b=0; c=0;
        for (a=4; a<7; a++)
        {
            while (b<10)
            {
                b++;
                c=a*b;
                System.out.println (""+a+" * "+b+" = "+c);
            }
          b=0;
          c=0; 
        }
    }
    
}
