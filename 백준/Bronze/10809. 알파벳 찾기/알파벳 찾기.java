import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");


        int[] result = new int[list.size()];
        List<String> list1 = Arrays.stream(s.split("")).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            if(list1.contains(s1)) {
                result[i] = list1.indexOf(s1);
            } else {
                result[i] = -1;
            }

        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        in.close();
    }
}