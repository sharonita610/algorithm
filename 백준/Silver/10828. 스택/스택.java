import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(in.readLine());


        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < loop; i++) {
            String s = in.readLine();
            if (s.contains("push")) {
                String[] strings = s.split(" ");
                stack.push(Integer.parseInt(strings[1]));
            } else if (s.equals("pop")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                } else {
                    System.out.println(-1);
                }
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("empty")) {
                if(stack.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (s.equals("top")) {
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }

        in.close();
    }
}
