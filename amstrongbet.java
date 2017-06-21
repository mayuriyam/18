import java.io.*;
import java.util.*;
class amstrongbet
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in); 
        int num = sc.nextInt();
        int no=sc.nextInt();
        int a,sum=0,n,b;
        for(int i = num; i <= no; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
 
               
        
       
	    
	  
        
 



