import java.util.*;
class que3
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur income in lakhs");
        float tax=0;  float income=sc.nextFloat();
        if(income<=2.5){
            tax=tax+0;
        }
       else if(income>2.5f&& income<=5f)
        {
            tax=tax +0.05f*(income-2.5f);
        }
        else if(income>5f && income<=10f){
            tax=tax+0.05f*(5.0f -2.5f);
            tax=tax+0.05f*(income -2.5f);
        }
                    else if(income<10f){
                tax=tax+0.05f*(5.0f -2.5f);
                tax=tax+0.05f*(10.0f -5.0f);
                tax=tax+0.05f*(income -2.5f);
        }
        System.out.println("The total tax paid is"+tax);
    }
}
    
