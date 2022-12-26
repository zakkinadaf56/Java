import java.util.*;
class fibo 
{
public static void main(String ar[])
{
    int i,n,a=0,b=1,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    n=sc.nextInt();
    System.out.println(0+","+1);
    for(i=0;i<=n-2;i++)
    {

        c=a+b;
        System.out.println(","+c);
        a=b;
        b=c;
    }
    
}    
}
