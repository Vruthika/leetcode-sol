class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int ar=0;
        while(l<r){
            int t=Math.min(height[l],height[r])*(r-l);
            ar=Math.max(t,ar);
            if(height[l]<height[r]){
                l+=1;
            }
            else{
                r-=1;
            }
        }
        return ar;
    }
}