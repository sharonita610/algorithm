import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		char[] charArray = br.readLine().toCharArray();

		long total = 0;
		for (int i = 0; i < N ; i++) {
			total += charArray[i] - '0';
		}
		System.out.println(total);
	}
}
