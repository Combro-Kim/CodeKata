class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        int n = numLog[0];
        
        for(int i = 1; i<numLog.length;i++) {
        	int num = numLog[i] - numLog[i-1];
        	
        	switch (num) {
			case -1:
				sb.append('s');
				break;
			case 1:
				sb.append('w');
				break;
			case 10:
				sb.append('d');
				break;
			case -10:
				sb.append('a');
				break;
			}
        		
        }
        
        return sb.toString();
    }
}