class Solution {
    public int arrangeCoins(int n) {
           
        if(n==1)
            return n;
        
        else {
        int  i = 1 ;
        while (n-i>=0){
            n= n-i ;
            i++ ;

            }
            return i-1 ;
        }
        
        
        
    }
}