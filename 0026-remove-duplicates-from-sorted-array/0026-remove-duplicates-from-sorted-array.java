class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int x:nums){
            if(k==0 || nums[k-1]!=x){
                nums[k++]=x;
            }
        }
        return k;
    }
}