class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l[]=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<nums1.length;i++)
        {
            l[j++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            l[j++]=nums2[i];
        }
        double r=0;
        Arrays.sort(l);
        if(l.length%2!=0)
        r=(double)l[l.length/2];
        else
        r=(double)((l[l.length/2])+(l[l.length/2-1]))/2;
        return r;
    }
}