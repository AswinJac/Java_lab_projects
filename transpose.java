import java.util.Scanner;
class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter number of rows");
        System.out.println("Enter number of coloumns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();}
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();}
        }
        
    
}
