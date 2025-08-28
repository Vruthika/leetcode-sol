class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max_diag=0;
        int max_area=0;
        for(int i=0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            double diag = Math.sqrt((l*l) + (b*b));
            if(diag>max_diag){
                max_diag=diag;
                max_area = l*b;
            }
            else if(diag==max_diag){
                max_area = Math.max(max_area,l*b);
            }
        }
        return max_area;
    }
}