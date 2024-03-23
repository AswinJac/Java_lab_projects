import java.util.Scanner;
class exceptionhandling {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter a in a/b");
    a=sc.nextInt();
    System.out.println("Enter b in a/b");
    b=sc.nextInt();
    try{
        int q;
        q=a/b;
        System.out.println("Divided Value ="+q);
    }
    catch(ArithmeticException ae)
    {
        System.out.println("Division by Zero");
    }
    finally{
        System.out.println("Executed Succesfully");
        sc.close();
    }
    
}
}