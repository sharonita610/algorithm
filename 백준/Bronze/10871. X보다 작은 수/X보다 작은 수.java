import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int totalNum = Integer.parseInt(st.nextToken());
		int reqNum = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long[] S = new long[totalNum];
		for (int i = 0; i < totalNum; i++) {
			S[i] = Integer.parseInt(st.nextToken());
			if(S[i] < reqNum) {
				System.out.print(S[i] + " ");
			}
		}
	}
}
