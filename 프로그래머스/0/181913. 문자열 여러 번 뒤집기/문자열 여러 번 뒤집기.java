class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int[] q : queries) {
        	int s = q[0];
        	int e = q[1];
        	
        	while(s<e) {
        		char left = sb.charAt(s);
        		char right = sb.charAt(e);
        		sb.setCharAt(s, right);
        		sb.setCharAt(e, left);
        		s++;
        		e--;
        	}
        }
        return sb.toString();
    }
}