import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int[] arr = new int[9];
        int max = arr[0],n = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                n= i + 1;
            }
        }
        System.out.println(max);
        System.out.println(n);

    }
}