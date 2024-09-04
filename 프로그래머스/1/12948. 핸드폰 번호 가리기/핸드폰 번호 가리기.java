class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String answer = "*".repeat(len-4);
        return answer+ phone_number.substring(len-4);
    }
}