//Este programa imprime los numeros de 1 a 10 con su factorial al frente con FOR
import java.io.*;
public class Prog12
{
    public static void main(String args[])
    {
        int n,f;
        n=0;
        f=1;
        for (n=1; n<=10; n++)
        {
            f=f*n;
            System.out.println(""+n+"    "+f);
        }
    }
    
}
