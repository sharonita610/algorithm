import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int read =  Integer.parseInt(in.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= read; i++) {
            int num = Integer.parseInt(in.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);

        in.close();
    }
}