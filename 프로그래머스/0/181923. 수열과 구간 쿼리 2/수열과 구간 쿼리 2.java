class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i<queries.length;i++) {
        	int s = queries[i][0];
        	int e = queries[i][1];
        	int k = queries[i][2];
        	
        	int n = -1;
        	
        	for(int j=s; j<=e;j++) {
        		if(arr[j] > k && arr[j] != -1) {
        			if(n != -1) {
        				n = n < arr[j] ?  n: arr[j];
        			}else {
        				n = arr[j];
        			}
        			
        		}
        	}
        	answer[i] = n;
        	
        }
        
        return answer;
    }
}