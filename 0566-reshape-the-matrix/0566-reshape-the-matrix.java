class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // creating  new 2d array of given size r *c   
        int[][] ans = new int[r][c];
        
        
        // storing existing 2d array in list 
       ArrayList<Integer> list = new ArrayList<>();
        
        
        // if size does not match with r and c 
        if(mat.length*mat[0].length!=r*c){
            return mat ;
        }
        
        //storing existing 2d array in list 
        for(int row= 0;row<mat.length;row++){
            for(int col=0;col<mat[row].length;col++){
                
                list.add(mat[row][col]);
            }
        }
        int k = 0 ;
        
        // storing element from list to new array of given  reshape size   r and c 
         for(int row= 0;row<r;row++){
            for(int col=0;col<c;col++){
                
              ans[row][col] =  list.get(k++);
            }
        }
        return ans;
        
    }
}