class Solution {
    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 1; j <= food[i] / 2; j++) {
                answer.append(i);
            }
        }

        return answer.toString() + "0" + answer.reverse().toString();
    }
}