class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        st,end=-1,-1
        for i in range(len(nums)):
            if nums[i]==target:
                if st==-1:
                    st=i
                end=i
        return [st,end]        