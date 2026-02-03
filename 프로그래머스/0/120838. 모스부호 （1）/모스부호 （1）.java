import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
    private static final Map<String, String> MORSE = new HashMap<>();

    static {
        MORSE.put(".-", "a"); MORSE.put("-...", "b"); MORSE.put("-.-.", "c");
        MORSE.put("-..", "d"); MORSE.put(".", "e"); MORSE.put("..-.", "f");
        MORSE.put("--.", "g"); MORSE.put("....", "h"); MORSE.put("..", "i");
        MORSE.put(".---", "j"); MORSE.put("-.-", "k"); MORSE.put(".-..", "l");
        MORSE.put("--", "m"); MORSE.put("-.", "n"); MORSE.put("---", "o");
        MORSE.put(".--.", "p"); MORSE.put("--.-", "q"); MORSE.put(".-.", "r");
        MORSE.put("...", "s"); MORSE.put("-", "t"); MORSE.put("..-", "u");
        MORSE.put("...-", "v"); MORSE.put(".--", "w"); MORSE.put("-..-", "x");
        MORSE.put("-.--", "y"); MORSE.put("--..", "z");
    }
    
    public String solution(String letter) {
       
        return Arrays.stream(letter.split(" "))
                .map(MORSE::get)
                .collect(Collectors.joining());
    }
}