import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            HashSet<Character> set = new HashSet<>();
            boolean isGroup = true;
            char prev = ' ';

            for (int j = 0; j < string.length(); j++) {
                char now = string.charAt(j);

                if (prev != now) {
                    if (set.contains(now)) {
                        isGroup = false;
                        break;
                    }
                    set.add(now);
                    prev = now;
                }
            }
            if (isGroup) {
                result++;
            }
        }
        System.out.println(result);    
     }
}