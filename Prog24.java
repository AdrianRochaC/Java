//Este programa imprime las tablas del 4, 5 y 6 FOR - Until
import java.io.*;
public class Prog24 
{
    public static void main (String args [])
    {
        int a,b,c;
        a=4; b=0; c=0;
        for (a=4; a<7; a++)
        {
            do
            {
                b++;
                c=a*b;
                System.out.println(""+a+" * "+b+" = "+c);
            }while (b<10);
       
               b=0;
               c=0;
           
        }
    }
    
}
