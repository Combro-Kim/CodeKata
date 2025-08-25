import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> arr = new ArrayList<>();
        
        for(int a : num_list) {
        	arr.add(a);
        }
        
        int n = arr.get(arr.size() -2) < arr.get(arr.size()-1) ? arr.get(arr.size()-1) - arr.get(arr.size()-2) : arr.get(arr.size()-1) * 2;
        arr.add(n);
        
        int answer[] = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}