import java.util.Scanner;
class multiplicationmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter number of rows");
        System.out.println("Enter number of coloumns");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        insert(a,r1,c1,sc);
        System.out.println("Enter number of rows");
        System.out.println("Enter number of coloumns");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        insert(b,r2,c2,sc);
        System.out.println("FIRST MATRIX");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();}
            System.out.println("SECOND MATRIX");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();}
            System.out.println("Multiplited Matrix");
        mult(a,b,r1,c1,r2,c1,sc);
}

    static  void insert(int a[][],int r,int c,Scanner sc)
    {
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    static void mult(int a[][],int b[][],int r1,int c1,int r2,int c2,Scanner sc)
    {
        if(c1==r2)
        {
            int c[][]=new int[r1][c2];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    c[i][j]=0;
                    for(int k=0;k<c1;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+" ");
            }
            System.out.println();}
        }
     }
    }

