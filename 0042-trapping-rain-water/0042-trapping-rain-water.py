class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0
        
        l,r=0,len(height)-1
        max_l=height[l]
        max_r=height[r]

        res=0
        while l<=r:
            if height[l]<height[r]:
                if height[l]>=max_l:
                    max_l=height[l]
                else:
                    res+=max_l-height[l]
                l+=1
            else:
                if height[r]>=max_r:
                    max_r=height[r]
                else:
                    res+=max_r-height[r]
                r-=1
        return res