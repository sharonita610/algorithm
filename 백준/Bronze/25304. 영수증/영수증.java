import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        int totPri, items, price, unit, total = 0;
        Scanner sc = new Scanner(System.in);
        totPri = sc.nextInt();
        items = sc.nextInt();
        for (int i = 0; i < items; i++) {
            price = sc.nextInt();
            unit = sc.nextInt();
            total += (price*unit);
        }

       
        if(totPri == total){
            System.out.print("Yes");
        }else {
            System.out.print("No");

        }
        sc.close();

    }
}