import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        
        for(String str: intStrs) {
        	int n = Integer.parseInt(str.substring(s,s+l));
        	if(n>k) {
        		arr.add(n);
        	}
        }
        
        return arr.stream().mapToInt(Integer::valueOf).toArray();
    }
}