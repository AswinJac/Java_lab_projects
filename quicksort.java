import java.util.Scanner;
class quicksort {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int i;
       System.out.println("Enter number of elements");
       int n=sc.nextInt();
       String a[]=new String[n];
       System.out.println("Enter elements");
       for(i=0;i<n;i++)
       {
        a[i]=sc.next();}
        quicks(a,0,n-1);
        System.out.println("After Sorting elements");
       for(i=0;i<n;i++)
       {
        System.out.println(a[i]+"  ");
    }
        sc.close();

    }
    static void quicks(String a[],int lb,int ub)
    {
        if(lb<ub)
        {
            int loc=partition(a,lb,ub);
            quicks(a,lb,loc-1);
            quicks(a, loc+1, ub);
        } }
        static int partition(String a[],int lb,int ub)
        {
            String pivot=a[lb];
            int i=lb;
            int j=ub;
            while(i<j)
            {
                while(a[i].compareTo(pivot)<=0)
                i++;
                while(a[j].compareTo(pivot)>0)
                j--;
                if(i<j)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            String temp=a[j];
            a[j]=a[lb];
            a[lb]=temp;
            return j;
        }
    
}
