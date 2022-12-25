public class methodoverloading {
static void foo(){
    System.out.println("Goiod morning  bro");
}
static void foo(int a){
    System.out.println("Good morning "+a+"Bro!");
}
static void foo(int a ,int b){
    System.out.println("Good morning "+a+ "bro");
    System.out.println("Good morning "+b+ "bro");
}
    static void change(int a)
    {
        a=98;
    }
    static void change2(int [] arr)
    {
        arr[0]=98;
    }
    static void telljoke()
    {
        System.out.println("I invented a newword!\n"+"Plagarism!");
    }
public static void main(String[] args) {
    //int [] marks={56,77,78,82,97,94};
    //changing the integer
    //int x=45;
    //change(x);
    //System.out.println("The value of x after running change is:"+x);
    //changing the array
   // change2(marks);
 //   System.out.println("The value of x after running change is"+marks[0]);
foo();
foo(3000);
foo(3000,400); //Arguments are actual
}


}
