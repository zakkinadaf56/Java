import java.util.*;
class armstrg 
{
    public static void main(String args[]) 
    {
        int num,temp,dig,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        temp=sc.nextInt();
        num=temp;

        while(num!=0)
        {
            dig=num%10;
            sum=sum+(dig*dig*dig);
            num=num/10;
        }
           if(sum==temp)
          {
              System.out.println("Armstrong number");
          }
            else
            {
                System.out.println("not a armstrong  number");
            }  
        }
    
}
