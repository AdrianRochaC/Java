# PARCIAL 3

import java.io.*;
public class Prog50
{
    public static void main (String args[])throws IOException
    {
        int a,b,c,d,r;
        float n,f;
        a=0;b=0;c=0;d=0;r=0;n=0;f=1;
        String valor;
        BufferedReader Entrada=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Digite primer valor   ");
        valor=Entrada.readLine();
        a=Integer.parseInt(valor);
        System.out.print("Digite segundo valor   ");
        valor=Entrada.readLine();
       b=Integer.parseInt(valor);
       System.out.print("Digite tercer valor   ");
       valor=Entrada.readLine();
       c=Integer.parseInt(valor);
       System.out.print("Digite cuarto valor   ");
       valor=Entrada.readLine();
       d=Integer.parseInt(valor);
       {
           if((a>0)&&(b>0)&&(c>0)&&(d>0))    
           {
               if((a==b)||(a==c)||(a==d)||(b==c)||(b==d)||(c==d))
                       {
                           System.out.println("ERROR Valores Invalidos");
                       }
               else
               {
                   if(b<c)
                   {
                       while(b<=c)
                       {
                           System.out.println(b);
                           b=b+3;
                       }
                   }
                   else
                       System.out.println("ERROR Valores Invalidos");
               }
               if(a<d)
               {
                   while(n<a)
                   {
                       n++;
                       f=f*n;
                   }
                       
                       r=a%7;
                       if(r==0)
                       {
                           System.out.println("El numero menor es  " + a + " Su factorial es  " + f + "  " + "SI");
                       }
                       else
                       {
                           System.out.println("El numero menor es  " + a + " Su factorial es  " + f + "  " + "NO");
                       }
                            
                   
               }
               else
               {
                   while(n<d)
                   {
                       n++;
                       f=f*n;
                   }
                     
                        r=d%7;
                        if(r==0)
                        {
                               System.out.println("El numero menor es  " + d + " Su factorial es  " + f + "  " + "SI");
                       }
                       else
                       {
                           System.out.println("El numero menor es  " + d + " Su factorial es  " + f + "  " + "NO");
                       }
                   
                  }
            }
           else
                   System.out.println("ERROR Valores Invalidos");
                   
       }
    }
    
}
