import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] strings = s.split(" ");
        int bas = Integer.parseInt(strings[0]);
        int[] results = new int[bas];
        int count = Integer.parseInt(strings[1]);

         for (int i = 0; i < count; i++) {
            String request = br.readLine();

            if(request.isEmpty()) continue;
            String[] strings1 = request.split(" ");
            int start = Integer.parseInt(strings1[0]) - 1;
            int end = Integer.parseInt(strings1[1]) - 1;
            int k = Integer.parseInt(strings1[2]);

            for (int j = start; j <= end; j++) {
                results[start] = k;
                start++;
            }
        }

        for (int result : results) {
            System.out.print(result + " ");
        }
    }
}