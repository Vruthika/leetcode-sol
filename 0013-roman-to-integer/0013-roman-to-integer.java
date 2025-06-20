class Solution {
    public int romanToInt(String s) {
        int i,sum=0,curr=0,prev=0;
        for(i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            switch(c){
                case 'M':
                {
                    curr=1000;
                    break;
                }
                case 'D':
                {
                    curr=500;
                    break;
                }
                case 'C':
                {
                    curr=100;
                    break;
                }
                case 'L':
                {
                    curr=50;
                    break;
                }
                case 'X':
                {
                    curr=10;
                    break;
                }
                case 'V':
                {
                    curr=5;
                    break;
                }
                case 'I':
                {
                    curr=1;
                    break;
                }

            }
            if(curr<prev){
                sum-=curr;
            }
            else{
                sum+=curr;
            }
            prev=curr;
        }
        return sum;
    }
}