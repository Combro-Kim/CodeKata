class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Idx = 0;
        int card2Idx = 0;

        for (String target : goal) {
            if (card1Idx < cards1.length && target.equals(cards1[card1Idx])) {
                card1Idx++;
            } else if (card2Idx < cards2.length && target.equals(cards2[card2Idx])) {
                card2Idx++;
            } else {
                answer = "No";
            }
        }
        return answer;
    }
}