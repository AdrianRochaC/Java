//Este programa pide un valor y empieza desde 3 de 3 en 3 hasta llegar al valor digitado por el usuario con While
import java.io.*;
public class Prog26 
{
    public static void main (String args [])throws IOException
    {
        int n,m;
        n=0;
        m=3;
        String valor;
        BufferedReader Entrada=new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Digite un valor   ");
        valor= Entrada.readLine();
        n=Integer.parseInt(valor);
        if(n>=3)
        {
            while (m<=n)
            {
                System.out.println(m);
                m=m+3;
            }
        }
        else
            System.out.println ("ERROR Valores Invalidos");
    }
    
}
