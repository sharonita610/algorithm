import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalPrice = sc.nextInt();
		int totalCount = sc.nextInt();

		for (int i = 1; i <= totalCount; i++) {
			int unitPrice = sc.nextInt();
			int unitCount = sc.nextInt();
			totalPrice -= unitPrice * unitCount;
		}

		if (totalPrice == 0) {
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
		sc.close();
	}
}