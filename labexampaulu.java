import java.io.*;
class labexampaulu {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        File inp=new File("input.txt");
        try{
        FileReader fr=new FileReader(inp);
        BufferedReader br=new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
        {
            String array[]=s.split(" ");
            int len=array.length;
            System.out.println("Number of Words ="+len);
            System.out.println("Words are:");
            for(int i=0;i<len;i++)
            {
                System.out.println(array[i]);
            }
            System.out.println("Words in reversed order are:");
            for(int j=len-1;j>=0;j--)
            {
                System.out.println(array[j]);
            }
            System.out.println("Words that are singular");
            for(int i=0;i<len;i++)
            {
                if(array[i].charAt(array[i].length()-1)!='s')
                System.out.println(array[i]);
            }


        }
    br.close();}

        catch(Exception e)
        {
            System.out.println("Error");
        }
        finally{
            
        }}}
