import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(in.readLine());

        Queue<DocumentToPrint> queue = new LinkedList<>();

        for (int i = 0; i < testCases; i++) {
            String test = in.readLine();
            String[] strings = test.split(" ");

            int index = Integer.parseInt(strings[1]);

            String s = in.readLine();
            String[] numbers = s.split(" ");

            for (int j = 0; j < numbers.length; j++) {
                queue.add(new DocumentToPrint(numbers[j], j));
            }

            int max = 0;
            int pollingCount = 0;
            while (!queue.isEmpty()) {
                for (DocumentToPrint documentToPrint : queue) {
                    if (documentToPrint.getPriority() > max) {
                        max = documentToPrint.getPriority();
                    }
                }
                DocumentToPrint currentDoc = queue.poll();

                if (currentDoc != null ) {
                    if (currentDoc.getPriority() == max) {
                        pollingCount++;
                        if (currentDoc.getInitialIndex() == index) {
                            System.out.println(pollingCount);
                            break;
                        } else {
                            max = 0;
                            continue;
                        }
                    }
                    queue.add(currentDoc);
                }
            }
            queue.clear();
        }

        in.close();
    }

    private static class DocumentToPrint {

        private final int initialIndex;
        private final int priority;

        public DocumentToPrint(String string, int index) {
            initialIndex = index;
            priority = Integer.parseInt(string);
        }

        public int getInitialIndex() {
            return initialIndex;
        }

        public int getPriority() {
            return priority;
        }
    }
}