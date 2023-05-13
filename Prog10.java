//Este programa imprime los numeros del 1 al 10 con su factorial al frente con while
import java.applet.*;
public class Prog10 
{
    public static void main (String args [])
    {
        int n,f;
        n=0;
        f=1;
        while (n<10)
        {
            n++;
            f=f*n;
            System.out.println(""+n+"    "+f);
        }
    }
    
}
