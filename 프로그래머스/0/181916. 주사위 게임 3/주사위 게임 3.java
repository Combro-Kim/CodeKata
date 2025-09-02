class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = new int[7];
        
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;
        
        
        // 4
        for(int i = 1; i<arr.length;i++) {
        	if(arr[i] == 4) {
        		return i * 1111;
        	}
        }
        
        // 3 + 1
        int p = -1;
        int q = -1;
        for(int i = 1; i<arr.length;i++) {
        	if(arr[i] == 3) {
        		p = i;
        		for(int j = 1; j <arr.length;j++) {
        			if(arr[j] ==1) {
        				q = j;
        			}
        		}
        		return (10 * p + q) * (10 * p + q);
        	}
        }
        
        // 2 + 2
        p = -1;
        q = -1;
        for(int i = 1; i<arr.length;i++) {
        	if(arr[i] == 2) {
        		if(p == -1) {
        			p = i;
        		}else {
        			q = i;
        		}
        	}
        	if(q != -1 && p != -1) {
        		return (p+q) * Math.abs(p-q);
        	}
        }
        
        // 2 + 1 + 1
        if(p != -1) {
            q = -1;
            int r = -1;
            
            for(int i = 1; i<arr.length;i++) {
            	if(arr[i] == 1) {
            		if(q == -1) {
            			q = i;
            		}else {
            			r = i;
            		}
            	}
            }
            if(r != -1) {
            	return q * r;
            }
        }
        
        // 1 + 1 + 1 +1
        for(int i = 1; i<arr.length;i++) {
        	if (arr[i] ==1) {
        		return i;
        	}
        }
        
        return 0;
    }
}