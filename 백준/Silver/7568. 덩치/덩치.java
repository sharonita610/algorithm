import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int request = Integer.parseInt(in.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < request; i++) {
            String person = in.readLine();
            String[] strings = person.split(" ");
            persons.add(new Person(strings));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < request; i++) {
            int record = 1;
            Person me = persons.get(i);
            for (int j = 0; j < request; j++) {
                if (i == j) continue;
                Person other = persons.get(j);
                if(me.weight < other.weight && me.height < other.height){
                    record++;                }
            }
            sb.append(record).append(" ");
        }
        System.out.println(sb);
    }

    private static class Person {
        private final int weight;
        private final int height;

        public Person(String[] strings) {
            this.weight = Integer.parseInt(strings[0]);
            this.height = Integer.parseInt(strings[1]);
        }
    }
}