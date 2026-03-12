import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<BigInteger> dp = new ArrayList<>();
        dp.add(BigInteger.valueOf(0));
        dp.add(BigInteger.valueOf(1));

        for (int i = 2; i < num + 1; i++) {
            dp.add(dp.get(i - 1).add(dp.get(i - 2)));
        }
        System.out.println(dp.get(num));
        br.close();
    }
}
