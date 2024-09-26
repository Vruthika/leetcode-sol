class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i:nums1)
            s1.add(i);
        for(int i:nums2)
            s2.add(i);
        Set<Integer> onlyn1=new HashSet<>(s1);
        onlyn1.removeAll(s2);
        Set<Integer> onlyn2=new HashSet<>(s2);
        onlyn2.removeAll(s1);
        res.add(new ArrayList<>(onlyn1));
        res.add(new ArrayList<>(onlyn2));
        return res;
    }
}