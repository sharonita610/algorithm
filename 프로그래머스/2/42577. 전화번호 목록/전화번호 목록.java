import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> phoneSet = new HashSet<>(Arrays.asList(phone_book));

        return Arrays.stream(phone_book).noneMatch(phone -> {
            for (int i = 1; i < phone.length(); i++) {
                if (phoneSet.contains(phone.substring(0, i))) {
                    return true;
                }
            }
            return false;
        });
    }
}