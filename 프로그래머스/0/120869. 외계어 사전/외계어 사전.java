
import java.util.*;

import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> spells = Arrays.stream(spell).collect(Collectors.toList());

        boolean exists = Arrays.stream(dic).anyMatch(word -> {
            for (String s : spells) {
                if (!word.contains(s)) {
                    return false;
                }
            }
            return true;
        });

        return exists ? 1 : 2;
    }
}