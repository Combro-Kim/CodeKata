class Solution {
    public String solution(String code) {
        String ret = "";

        int mode = 0;

        for(int i = 0; i<code.length();i++){
            if(mode == 0){
                if(code.charAt(i) == '1'){
                    mode = 1;
                }else{
                    if(i%2==0){
                        ret += code.charAt(i);
                    }
                }
            }else{
                if(code.charAt(i) == '1'){
                    mode = 0;
                }else{
                    if(i%2==1){
                        ret += code.charAt(i);
                    }
                }
            }
        }
        return ret.isEmpty() ? "EMPTY" : ret ;
    }
}