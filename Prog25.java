//Este programa pdie un valor y luego imprime si ese numero es par o impar
import java.io.*;
public class Prog25 
{
    public static void main (String args [])throws IOException
    {
        int n,r;
        n=0;
        r=0;
        String valor;
        BufferedReader Entrada=new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Digite un valor   ");
        valor=Entrada.readLine();
        n=Integer.parseInt(valor);
        r=n%2;
        if(r==0)
            System.out.println("El numero es PAR");
        else
            System.out.println("El numero es IMPAR");
    }
    
}
