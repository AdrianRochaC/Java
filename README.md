import java.io.*;
public class Prog30 
{
    public static void main (String args[])throws IOException
    {
        int a,b,c;
        a=0;
        b=0;
        c=0;
        String valor;
        BufferedReader Entrada=new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Digiete primer valor   ");
        valor=Entrada.readLine();
        a=Integer.parseInt(valor);
        System.out.print ("Digite segundo valor   ");
        valor=Entrada.readLine();
        b=Integer.parseInt(valor);
        System.out.print ("Digite tercer valor    ");
        valor=Entrada.readLine();
        c=Integer.parseInt(valor);
           if((a>0)&&(b>0)&&(c>0))
           {
               if((a==b)||(a==c)||(b==c))
                   System.out.println("ERROR Valores Invalidos");
               else
               {
                   if((a>b)&&(a>c))
                   {
                       if(b<c)
                           System.out.println("El numero Mayor es " + a + "  " + "El numero Menor es" + b);
                       else
                           System.out.println("El numero Mayor es " + a + "  " + "El numero Mneor es " +c);
                   }
                   else
                   {
                       if(b>c)
                       {
                           if(a<c)
                               System.out.println("El numero Mayor es " + b +"  " + "El numero Menor es " +a);
                           else
                               System.out.println("El numero Mayor es " + b + " " + "El numero Menor es " +c);
                       }
                       else
                       {
                           if(a<b)
                               System.out.println("El numero Mayor es " + c + "El numero Menor es " + a);
                           else
                               System.out.println("El numero Mayor es " + c + "El numero Menor es " + b);
                       }
                   }
               }
           }
           else
               System.out.println("Error Valores Invalidos");
        
    }
    
}






# EJERCICIO 41
import java.io.*;
public class Prog41 
{
    public static void main (String args[])throws IOException
    {
        int a,b,c,f,n,r;
        a=0;
        b=0;
        c=0;
        f=1;
        n=0;
        r=0;
        String valor;
        BufferedReader Entrada=new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Digite primer valor  ");
        valor=Entrada.readLine();
        a=Integer.parseInt(valor);
        System.out.print("Digite segundo valor  ");
        valor=Entrada.readLine();
        b=Integer.parseInt(valor);
        System.out.print("Digite tercer valor  ");
        valor=Entrada.readLine();
        c=Integer.parseInt(valor);
        if((a>0)&&(b>0)&&(c>0))
        {
            if((a==b)||(a==c)||(b==c))
                System.out.println("ERROR Valores Invalidos");
            else
            {
                if((a>b)&&(a>c))
                {
                    if(b<c)
                        for(n=1;n<=a; n++)
                        {
                            f=f*n;
                            System.out.println(""+a+"  "+f);
                            r=b%10;
                        }
                      if(r==0)
                          System.out.println(b+" "+" "+"SI");
                      else
                          System.out.println(b+" "+" "+"SI");
                    
                            
                }
            }
        }
    }
    
}
