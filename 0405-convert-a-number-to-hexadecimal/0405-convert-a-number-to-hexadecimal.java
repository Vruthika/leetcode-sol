class Solution {
    public String toHex(int num) {
        if(num==0)
            return "0";
        StringBuilder res=new StringBuilder();
        char[] d="0123456789abcdef".toCharArray();

        
        while(num!=0)
        {
            int rem=num & 15;
            res.append(d[rem]);
            num>>>=4;
        }

        return res.reverse().toString();

    }
}