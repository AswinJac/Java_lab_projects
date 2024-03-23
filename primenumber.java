import java.util.Scanner;
class primenumber
{
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("Not a Prime");
        else
        System.out.println("A Prime");
        sc.close();
    }
}