class Solution {
    public int fib(int n) {
       int a=0,b=1,c=0;
       if(n==1)
       return 1;
       for(int i=0;i<n-1;i++)
       {
        c=a+b;
        a=b;
        b=c;
       }
       return c;
    }
}