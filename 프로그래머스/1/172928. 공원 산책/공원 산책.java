import java.util.*;

class Solution {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};

        //시작위치 찾기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        Map<String, int[]> direction = new HashMap<>();
        direction.put("E", new int[]{0, 1});
        direction.put("W", new int[]{0, -1});
        direction.put("S", new int[]{1, 0});
        direction.put("N", new int[]{-1, 0});

        for (String str : routes) {
            String[] parts = str.split(" ");
            String dir = parts[0];
            int count = Integer.parseInt(parts[1]);

            int[] move = direction.get(dir);
            int nextX = answer[0];
            int nextY = answer[1];

            for (int i = 0; i < count; i++) {
                nextX += move[0];
                nextY += move[1];

                if (nextX < 0 || nextY < 0 || nextX >= park.length || nextY >= park[0].length() || park[nextX].charAt(nextY) == 'X') {
                    nextX = answer[0];
                    nextY = answer[1];
                    break;
                }
            }
            answer[0] = nextX;
            answer[1] = nextY;
        }
        return answer;
    }
}