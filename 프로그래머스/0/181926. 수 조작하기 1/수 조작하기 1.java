class Solution {
    public int solution(int n, String control) {
    	int num = n;
  
        for(char c : control.toCharArray()) {
        	if(c == 'w') num += 1;
        	if(c == 's') num -= 1;
        	if(c == 'd') num += 10;
        	if(c == 'a') num -= 10;
        }
        
        return num;
    }
}