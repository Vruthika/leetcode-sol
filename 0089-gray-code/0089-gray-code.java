import java.lang.*;
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list=new ArrayList<>();
        long r=(long)Math.pow(2,n);
        for(int i=0;i<r;i++)
        {
            list.add(i^(i/2));
        }
        return list;
    }
}