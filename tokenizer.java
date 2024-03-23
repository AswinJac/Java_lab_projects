import java.util.StringTokenizer;

public class tokenizer {
    public static void main(String[] args) 
       { String numbers = "10 20 30 40 50";
        int sum = 0;
        StringTokenizer toke= new StringTokenizer(numbers);
        while (toke.hasMoreTokens()) {
            String token = toke.nextToken();
            int num = Integer.parseInt(token);
            sum += num;
            
        }
        System.out.println("Sum of numbers: " + sum);
       
       }
}
