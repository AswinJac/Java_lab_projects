import java.util.*;
class FactorialThread extends Thread{
    int num;
    FactorialThread(int numb)
    {
        num=numb;}
        public void run()
        {
            int fact=1;
            for(int i=1;i<=num;i++)
            fact*=i;
            System.out.println("Factorial of number ="+fact);
        }
    }
class SumThread extends Thread{
    int num;
    SumThread(int num)
    {
        this.num=num;
    }
    public void run()
    {
        int sum=0;
        for(int i=0;i<=num;i++)
        sum+=i;
        System.out.println("Sum till number ="+sum);
    }
    }
class factorsum 
{
    public static void main(String[] args)
    {
        Random rand=new Random();
        int ran=rand.nextInt(1,10);
        System.out.println("Raandom number: "+ran);
        if(ran%2==0)
        {
            FactorialThread obj=new FactorialThread(ran);
            obj.start();
        }
        else
        {
            SumThread obj=new SumThread(ran);
            obj.start();
        }
    }
}
