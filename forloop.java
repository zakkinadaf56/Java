import java.util.*;
class forloop 
{
 public static void main(String ar[])
  {
     int no,i, fact=1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a no");
     no=sc.nextInt();
     for(i=1;i<=no;i++)
    
   {
       fact=fact*i;

   }
System.out.println("Factorial="+fact);
 }   
}
