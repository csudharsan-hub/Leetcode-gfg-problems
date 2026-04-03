class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0;i < n; i++){
            if(n % (i+1) == 0){
                int pow=nums[i] * nums[i];
                count += pow;
            }
        }
        return count;

    }
}