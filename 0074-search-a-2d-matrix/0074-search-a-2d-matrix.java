class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int row=arr.length;
        int col=arr[0].length;
        int left=0;
        int right=row*col-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int midelem=arr[mid/col][mid%col];
            if(midelem==t)
                return true;
            if(midelem>t)
                right=mid-1;
            else
                left=mid+1;
        }
        return false;
    }
}

/*
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}*/