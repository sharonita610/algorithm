import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        int total = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());

            if(a < 40) a = 40;
            total += a;
        }
        System.out.print(total/5);
    }
}