bool isPowerOfThree(int n) {
    if(n==0)
    {return false;}
    else if(n==1||n==3||n==9)
    {return true;}
    else if(n%9!=0)
    {return false;}
    return isPowerOfThree(n/9);
}