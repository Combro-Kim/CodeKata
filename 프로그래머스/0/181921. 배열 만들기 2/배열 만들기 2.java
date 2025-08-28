import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        q.add(5);
        
        while(!q.isEmpty()) {
        	int num = q.poll();
        	
        	if(num > r) continue;
        	
        	if(num >= l && num <= r) {
        		list.add(num);
        	}
        	
        	q.add(num * 10);
        	q.add(num * 10 + 5);
        }
        
        if(list.isEmpty()) {
        	return new int[]{-1};
        }
                
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}