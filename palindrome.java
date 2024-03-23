import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        String s;
        System.out.println("Enter a String");
        s=sc.next();
        for(int i=0;i<=(s.length()/2);i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                flag=1;
                break;
            }
         }
         if(flag==0)
         System.out.println("Palindrome String");
         else
         System.out.println("Not a Palindrome String");
         sc.close();
    }
    
}
