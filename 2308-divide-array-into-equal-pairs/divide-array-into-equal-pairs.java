class Solution {
    public boolean divideArray(int[] nums) {
        int freq[]=new int[501];
        for(int i : nums){
            freq[i]++;
        }
        int count=0;

        for(int i=1 ;i < freq.length ; i++ ){
            if(freq[i] % 2 != 0 ){
                return false;
            }
        }
        return true;
    }
}