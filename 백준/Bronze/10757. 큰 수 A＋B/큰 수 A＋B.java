import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] strings = s.split(" ");
        BigInteger A = new BigInteger(strings[0]);
        BigInteger B = new BigInteger(strings[1]);

        System.out.println(A.add(B));
        reader.close();
    }
}