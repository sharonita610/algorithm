import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			char first = line.charAt(0);
			char last = line.charAt(line.length() - 1);
			sb.append(first).append(last).append("\n");
		}
		System.out.println(sb);
	}
}
