//Este programa imprime una lista empezando en n y termina en m de a 1 con Until 
import java.io.*;
public class Prog27 
{
    public static void main (String args [])throws IOException
    {
        int n,m;
        n=0;
        m=0;
        String valor;
        BufferedReader Entrada=new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Digite primer valor   ");
        valor=Entrada.readLine();
        n=Integer.parseInt(valor);
        System.out.print("Digite segundo valor   ");
        valor=Entrada.readLine();
        m=Integer.parseInt(valor);
        if(n<m)
        {
            do
            {
                System.out.println(n);
                n++;
            }while (n<=m);
        }
        else
            System.out.println("ERROR Valores Invalidos");
    }
    
}
