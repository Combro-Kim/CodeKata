class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length+1];

        for(int i =0; i<num_list.length;i++){
            arr[i] = num_list[i];
        }

        int last = num_list[num_list.length-1];
        int secondLast = num_list[num_list.length-2];

        if(last > secondLast){
            arr[num_list.length] = last - secondLast;
        }else{
            arr[num_list.length] = last * 2;
        }

        return arr;
    }
}