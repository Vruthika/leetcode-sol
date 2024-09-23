class Solution {
    public String toHex(int num) {
        if(num==0)
            return "0";
        StringBuilder res=new StringBuilder();
        char[] d="0123456789abcdef".toCharArray();

        
        while(num!=0)
        {
            int rem=num & 15;   //equivalent to num%16 and  efficiently extracts the last hexadecimal digit
            res.append(d[rem]);
            num>>>=4;  //equivalent to num/16 (unsigned right shift operation)

            //This operation treats num as an unsigned 32-bit integer,
            // which is crucial for correctly handling negative numbers 
            //in the context of bitwise operations. In Java, negative numbers are
            // represented in two's complement format, so >>> ensures that the shift is unsigned,
            // avoiding issues with sign extension
        }

        return res.reverse().toString();

    }
}