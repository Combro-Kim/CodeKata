class Solution {
    public int solution(int[] num_list) {
       
    	String hol = "";
    	String zzak = "";
    	
    	for(int i : num_list) {
    		if(i%2 == 0) {
    			zzak += String.valueOf(i);
    		}else {
    			hol += String.valueOf(i);
    		}
    	}
    	
    	return Integer.valueOf(hol) + Integer.valueOf(zzak);
    }
}