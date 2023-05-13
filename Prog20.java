//Este programa imprime las tablas del 4, 5 y 6 con While - FOR
import java.io.*;
public class Prog20 
{
    public static void main (String args[])
    {
        int a,b,c;
        a=4; b=0; c=0;
        while (a<7)
        {
            for(b=1; b<=10; b++)
            {
                c=a*b;
                System.out.println(""+a+" * "+b+" = "+c);
            }
            a++;
            b=0;
            c=0;
        }
    }
    
}
