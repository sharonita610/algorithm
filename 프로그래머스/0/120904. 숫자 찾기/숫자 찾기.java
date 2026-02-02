
class Solution {
    public int solution(int num, int k) {
        
        String numbers = String.valueOf(num);
        int index = numbers.indexOf(String.valueOf(k));
        return (index == -1) ? -1 : index + 1;
    }
}