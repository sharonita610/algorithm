import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        int n, a, b;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("Case #"+ i + ": "+ (a +b ));
        }
        sc.close();
    }
}