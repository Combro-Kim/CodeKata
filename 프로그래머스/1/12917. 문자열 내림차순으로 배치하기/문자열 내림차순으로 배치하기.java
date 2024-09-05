import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
    	String answer = s.chars()
    			.mapToObj(c -> (char)c)
    			.sorted(Collections.reverseOrder())
    			.map(String::valueOf)
    			.collect(Collectors.joining());
        return answer;
    }
}