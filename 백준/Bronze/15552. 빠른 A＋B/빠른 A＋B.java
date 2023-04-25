import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String string = br.readLine();
            int a = Integer.parseInt(string.split(" ")[0]);
            int b = Integer.parseInt(string.split(" ")[1]);
            int c = a + b;
            bw.write(c+"\n");

        }
            bw.flush();
            br.close();
    }
}