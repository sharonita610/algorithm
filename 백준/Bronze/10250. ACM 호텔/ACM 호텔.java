import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        for (int j = 0; j < i; j++) {
            String request = br.readLine();
            String[] strings = request.split(" ");
            int H = Integer.parseInt(strings[0]);
            int W = Integer.parseInt(strings[1]);
            int N = Integer.parseInt(strings[2]);

            int floor = N % H;
            int room= (N / H) + 1;
            if (floor == 0) {
                floor = H;
                room -= 1;
            }
            System.out.println((floor * 100) + room);

        }
        br.close();
    }
}
