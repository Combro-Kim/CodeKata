class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = a;
        int answer = 0;

        for(int i =0; i<included.length;i++){
            if(included[i]){
                answer += sum;
            }
            sum += d;
        }
        return answer;
    }
}