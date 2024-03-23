import java.util.Scanner;
class noofchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s;
        System.out.println("Enter a String");
        s=sc.next();
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                c++;
            }
        }
        System.out.println(ch+" is repeated "+c+" number of times");
        sc.close();
    }
    }
