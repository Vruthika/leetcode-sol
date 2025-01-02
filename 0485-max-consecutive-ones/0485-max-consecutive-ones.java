class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct=0,curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr+=1;
                ct=Math.max(ct,curr);
            }
            else{
                curr=0;
            }
        }
        return ct;
    }
}