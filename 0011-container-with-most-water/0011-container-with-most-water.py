class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        ar=0
        while(l<=r):
            h=min(height[l],height[r])*(r-l)
            ar=max(ar,h)
            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
        return ar
            
        