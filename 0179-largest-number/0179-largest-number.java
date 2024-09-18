class Solution {
    public String largestNumber(int[] nums) {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        StringBuilder s=new StringBuilder();
        for(String i:str)
        {
            s.append(i);
        }
        return (s.charAt(0)=='0')?"0":s.toString();
    }
}