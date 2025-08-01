class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> res=new HashSet<>();
        HashSet<Integer> prev=new HashSet<>();
        for(int num:arr){
            HashSet<Integer> curr=new HashSet<>();
            curr.add(num);
            for(int val:prev){
                curr.add(num|val);
            }
            res.addAll(curr);
            prev=curr;
        }
        return res.size();
    }
}