import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        String collect = Arrays.stream(String.valueOf(n).split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
        return Long.parseLong(collect);
    }
}
