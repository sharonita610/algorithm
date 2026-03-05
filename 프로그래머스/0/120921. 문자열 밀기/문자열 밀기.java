class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);

        if (sb.toString().equals(B)) {
            return 0;
        }
        int n = sb.length();

        for (int i = 1; i < n; i++) {
            char lastChar = sb.charAt(n - 1);
            sb.deleteCharAt(n - 1);
            sb.insert(0, lastChar);

            if (sb.toString().equals(B)) {
                return i;
            }
        }

        return -1;
    }
}