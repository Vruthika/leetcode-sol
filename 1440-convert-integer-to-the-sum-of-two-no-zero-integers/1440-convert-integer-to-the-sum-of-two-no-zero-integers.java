class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(!((i+"").contains("0") || (j+"").contains("0"))){
                    if(i+j==n)
                        return new int[]{i,j};
                }
            }
        }
        return new int[]{1,1};
    }
}