import java.util.*;
class x implements Runnable
{
    static int rand;
    Random randy=new Random();
    public void run()
    {
        rand=randy.nextInt(25);
        System.out.println("Number :"+rand);

    }

}
class y implements Runnable
{
    public void run()
    {
        synchronized(x.class)
        {
        if(x.rand%2==0)
        {
            System.out.println("Square:="+(x.rand*x.rand));

        }}
    }

}
class z implements Runnable
{
    public void run()
    {
        synchronized(x.class)
        {
        if(x.rand%2!=0)
        {
            System.out.println("Cube:= "+(x.rand*x.rand*x.rand));
        }}
    }
}
class threadrunnable {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit=sc.nextInt(); 
            x obx=new x();
            y oby=new y();
            z obz=new z();
        for(int i=0;i<limit;i++)
        {
        Thread objx=new Thread(obx);
        Thread objy=new Thread(oby);
        Thread objz=new Thread(obz);
        Thread.sleep(1000);
        objx.start();
        objy.start();
        objz.start();

    
        // objx.join();
        // objy.join();
        // objz.join();


        }
        sc.close();

    }
    
}
