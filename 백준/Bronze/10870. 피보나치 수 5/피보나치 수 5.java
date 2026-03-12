import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int fib = fib(num);
        System.out.println(fib);
        br. close();
    }

    public static int fib(int N) {
        if(N < 2) return N;
        return fib(N - 1) + fib(N - 2);
    }
}
