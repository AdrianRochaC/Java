//Este programa imprime la tabla del 4, 5 y 6 con FOR - FOR
import java.io.*;
public class Prog18 
{
    public static void main (String args [])
    {
        int a,b,c;
        a=0; b=0; c=0;
        for (a=4; a<7; a++)
        {
            for(b=1; b<=10; b++)
            {
                c=a*b;
                System.out.println(""+a+" * "+b+" = "+c);
            }
            c=0;
        }
    }
    
}
