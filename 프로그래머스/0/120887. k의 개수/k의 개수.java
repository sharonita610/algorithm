class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = (char)(k + '0');
        
        for(int x = i; x <= j; x++) {
            String s = String.valueOf(x);
            for(int idx = 0; idx < s.length(); idx++) {
                if(target == s.charAt(idx)) answer++;
            }
        }
        return answer;
    }
}