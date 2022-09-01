class Solution {
    public int arrangeCoins(int n) {
        
        long start = 0 ;
        long end = n ;
        
        while (end  >= start ){
            
            long mid = start+(end -start)/2;
            long k = (mid*(mid+1)/2) ;
            
            if( k<= n){
                start = mid+1 ;
            } 
            else end = mid -1;
        
        
        
        
        }
        return (int)start - 1 ;
           
       
        
        
        
    }
}