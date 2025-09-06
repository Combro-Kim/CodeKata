import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        int n = 0;
        while(my_string.length() != n) {
        	answer[n] = my_string.substring(n);
        	n++;
        }
        Arrays.sort(answer);
        return answer;
    }
}