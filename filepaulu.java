import java.io.*;
public class filepaulu {

	public static void main(String[] args)throws FileNotFoundException,IOException{
		File input=new File("input.txt");
        File ouput=new File("ouput.txt");
        FileInputStream fi=new FileInputStream(input);
        FileOutputStream fo=new FileOutputStream(ouput);
		try {
			int c;
			while((c=fi.read())!=-1) {
				fo.write((char)c);
			}
			
		}catch(Exception e) {
			System.out.print("error");
		}
		finally {
			fi.close();
			fo.close();
			System.out.print("Executed");
		
		
	}	
	}

}