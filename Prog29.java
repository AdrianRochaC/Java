//Este programa pide 2 valores y hace una lista de uno en uno desde n hasta m con FOR
import java.io.*;
public class Prog29 
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
        System.out.print ("Digite segundo valor   ");
        valor=Entrada.readLine();
        m=Integer.parseInt(valor);
        if(n<m)
        {
            for(n=n; n<=m; n++)
            {
                System.out.println(n);
            }
        }
        else 
            System.out.println("ERROR Valores Invalidos");
    }
    
}
