import java.io.*;
class Filestream
{
    public static void main(String[] args) throws FileNotFoundException,IOException {
        File input=new File("input.txt");
        File ouput=new File("ouput.txt");
        FileInputStream fi=new FileInputStream(input);
        FileOutputStream f0=new FileOutputStream(ouput);
        try{
            int c;
            while((c=fi.read())!=-1)
            {
                f0.write((char)c);
            }}
            catch(Exception e)
            {
                System.out.println("Error");
            }
            finally
            {
                System.out.println("EXECUTED");
                fi.close();
                f0.close();
                
            }
    }
}