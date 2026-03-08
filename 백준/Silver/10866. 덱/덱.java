import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int j = 0; j < i; j++) {

            String string = br.readLine();
            String[] strings = string.split(" ");
            String letter = strings[0];
            if (letter.equals("push_front")) {
                stack.addFirst(Integer.parseInt(strings[1]));
            } else if (letter.equals("push_back")) {
                stack.addLast(Integer.parseInt(strings[1]));
            } else if (letter.equals("pop_front")) {
                if (stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pollFirst());
            } else if (letter.equals("pop_back")) {
                if (stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pollLast());
            } else if (letter.equals("size")) {
                System.out.println(stack.size());
            } else if (letter.equals("empty")) {
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (letter.equals("front")) {
                if (stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.getFirst());
            } else if (letter.equals("back")) {
                if (stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.getLast());
            }

        }
        br.close();
    }
}