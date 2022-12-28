class Demo
{
    void add(int a)
    {
        System.out.println("in add method one integrer para");
    }
    void add(int x,int b)
    {
        System.out.println("in add method 2 para");
    }
    void add(double a)
    {
System.out.println("float para");
    }
}
public class methodover{
public static void main(String[] args) {
    Demo ob=new Demo();
    ob.add(5,5);
}
}