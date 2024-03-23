import java.io.*;
class countfile
{
    public static void main(String[] args)throws IOException,FileNotFoundException {
        File f1=new File("input.txt");
        File f2=new File("output.txt");
        FileReader fr=new FileReader(f1);
        FileWriter fw=new FileWriter(f2);
        try{
            int sp=0,sl=0,sn=0;
            int c;
            while((c=fr.read())!=-1)
            {
                char ch=(char)c;
                if(ch==' ')
                sp++;
                else if(ch=='\n')
                sn++;
                else
                sl++;
            }
            fw.write("Number of Spaces:  "+sp+"\n");
            fw.write("Number of Letters: "+sl+"\n");
            fw.write("Number of NewLine: "+sn+"\n");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally
        {
            fr.close();
            fw.close();
        }

    }
}