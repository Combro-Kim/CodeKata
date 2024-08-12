class Solution {
    public int solution(int[] num_list) {
        int multiplication =1;
        int sq = 0;
        for(int num: num_list){
            multiplication *= num;
            sq += num;
        }
        return multiplication < sq*sq? 1:0;
    }
}