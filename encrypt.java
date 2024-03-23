import java.util.*;
import java.io.*;
class encrypt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s,temp;
        char ch;
        System.out.println("Enter a String");
        s=sc.nextLine();
        String array[]=s.split(" ");
        File out=new File("output.txt");
        try{
            FileWriter fw=new FileWriter(out);
            for(int i=0;i<array.length;i++)
        {
            int in;
            temp=array[i];
            temp=temp.toUpperCase();
            for(int j=0;j<temp.length();j++)
            {
                ch=temp.charAt(j);
                 in=(int)ch+2;
                 if(ch>'Z'||ch>'z')
                 in=in-26;
                fw.write((char)in);
            }
            fw.write(" ");

        }
        fw.close();

    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
    finally
    {
        sc.close();
    }
}
}