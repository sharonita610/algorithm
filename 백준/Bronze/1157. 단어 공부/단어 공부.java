import java.util.*;
import java.io.*;

public class Main {
public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        char[] charArray = string.toUpperCase().toCharArray();
        Arrays.sort(charArray);

        char answer = '?';
        int max = 0;
        char current = charArray[0];
        int currentIndex = 0;

        for (char c : charArray) {

            if (current == c) {
                currentIndex++;
            } else {

                if (currentIndex > max) {
                    max = currentIndex;
                    answer = current;
                } else if (currentIndex == max) {
                    answer = '?';
                }
                current = c;
                currentIndex = 1;
            }
        }

        if (currentIndex > max) {
            answer = current;
        } else if (currentIndex == max) {
            answer = '?';
        }
        System.out.println(answer);
        
        br.close();
    }    
}
