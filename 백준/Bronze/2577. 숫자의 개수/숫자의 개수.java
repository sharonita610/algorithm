import java.util.*;
import java.io.*;

public class Main {
public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        char[] charArray = String.valueOf(A * B * C).toCharArray();
        Arrays.sort(charArray);

        int[] answer = new int[10];

        for (char c : charArray) {
            if (c == '0') {
                answer[0] += 1;
            } else if (c == '1') {
                answer[1] += 1;
            } else if (c == '2') {
                answer[2] += 1;
            } else if (c == '3') {
                answer[3] += 1;
            } else if (c == '4') {
                answer[4] += 1;
            } else if (c == '5') {
                answer[5] += 1;
            } else if (c == '6') {
                answer[6] += 1;
            } else if (c == '7') {
                answer[7] += 1;
            } else if (c == '8') {
                answer[8] += 1;
            } else if (c == '9') {
                answer[9] += 1;
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }    
}
