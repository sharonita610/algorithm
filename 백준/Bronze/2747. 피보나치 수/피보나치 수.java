import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        
        for (int i = 2 ; i < result.length; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }
        System.out.println(result[result.length - 1]);

        br. close();
    }
}
