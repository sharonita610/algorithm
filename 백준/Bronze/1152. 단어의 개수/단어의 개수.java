import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();


        StringTokenizer st = new StringTokenizer(arr, " " );

        System.out.println(st.countTokens());
        
    }
}