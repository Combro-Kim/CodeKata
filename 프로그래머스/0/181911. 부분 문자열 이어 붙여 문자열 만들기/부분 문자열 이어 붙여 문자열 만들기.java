class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        int n = 0;
        for(int[] p: parts) {
        	int s = p[0];
        	int e = p[1];
        	
        	sb.append(my_strings[n].substring(s,e+1));
            n++;
        }
        
        return sb.toString();
    }
}