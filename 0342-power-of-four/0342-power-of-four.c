bool isPowerOfFour(int n){
    if(n<=0)
    return false;
    double r = log(n) / log(4);
    return floor(r)==r;

}