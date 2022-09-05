class Solution {
    public int countNegatives(int[][] grid) {
        
        
        int ans = 0 ;
        for (int[] row : grid) {
             ans += Bs(row);


        
    }
    return ans ;}

    public  int Bs(int[] grid) {


        int count = 0;
       int start = 0;
       int end = grid.length-1;


            while (end >= start) {
                int mid =  start +(end - start) / 2;
                if (grid[mid] >= 0) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                    count = grid.length-mid ;
                }
        }
        return count;



    }
        
    }
