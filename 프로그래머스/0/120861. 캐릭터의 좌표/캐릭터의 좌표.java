import java.util.*;

class Solution {
    static Map<String, int[]> map = new HashMap<>();
    static {
        map.put("up", new int[]{0, 1});
        map.put("down", new int[]{0, -1});
        map.put("left", new int[]{-1, 0});
        map.put("right", new int[]{1, 0});

    }
    
    public int[] solution(String[] keyinput, int[] board) {
        
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;

        int x = 0;
        int y = 0;
        
        for (String input : keyinput) {
            
            int[] dir = map.get(input);
            
            int nx = x + dir[0];
            int ny = y + dir[1];
            
            if (Math.abs(nx) <= limitX && Math.abs(ny) <= limitY) {
                x = nx;
                y = ny;
            }
        }
        return new int[]{x,y};
    }
}