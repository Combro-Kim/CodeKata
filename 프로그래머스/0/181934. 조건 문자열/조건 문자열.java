import java.util.Objects;

class Solution {
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (Objects.equals(eq, "=")) {
            if(Objects.equals(ineq, "<")){
                if(n<=m){
                    answer = 1;
                }
            }else{
                if(n>=m){
                    answer = 1;
                }
            }
        }else{
            if(Objects.equals(ineq, "<")){
                if(n<m){
                    answer = 1;
                }
            }else{
                if(n>m){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}