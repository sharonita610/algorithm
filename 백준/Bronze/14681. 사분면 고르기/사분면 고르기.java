


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x != 0 && y != 0) {
            if (x >= -1000 && x <= 1000) {
                if (y >= -1000 && y <= 1000) {
                    if (x > 0 && y > 0) {
                        System.out.print(1);
                    } else if (x < 0 && y > 0) {
                        System.out.print(2);
                    } else if (x < 0 && y < 0) {
                        System.out.print(3);
                    } else {
                        System.out.print(4);
                    }
                }
            }
        }


    }
}





