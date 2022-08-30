class Solution {
    public int mySqrt(int x) {
        
        
        int start = 0 ; 
        int end  = x-1  ; 
        int  ans  = 0 ;
        if (x ==1||x==0){
            return x;
        }
         while (end >=start){
             
            long  mid  = start +(end - start)/2;
           
             if (mid*mid == x) 
                 return (int)mid ;
             
              if (mid*mid > x) 
                 end = (int)mid  -1 ;
             
             else start = (int)mid +1 ;
               ans = end  ;
             
         }
        return ans   ;
        
    }
}