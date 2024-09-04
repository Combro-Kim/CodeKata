class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for (String str : seoul) {
            if (str.equals("Kim")) {
                break;
            }
            cnt++;
        }
        return String.format("김서방은 %d에 있다", cnt);
    }
}