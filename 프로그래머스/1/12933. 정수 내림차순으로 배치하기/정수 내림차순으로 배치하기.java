import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] arr = str.split("");

        Arrays.sort(arr, Collections.reverseOrder());
        String strA = String.join("", arr); // str

        return Long.parseLong(strA); //long
    }
}