class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[my_string.length()/m][m];
        
        for(int i = 0; i< my_string.length()/m; i++) {
        	for(int j = 0; j<m; j++) {
        		arr[i][j] = my_string.charAt(i * m + j);
        	}
        }
        
        for(int i = 0 ; i< arr.length;i++) {
        	sb.append(arr[i][c-1]);
        }
        return sb.toString();
    }
}