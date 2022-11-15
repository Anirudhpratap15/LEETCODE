class Solution {
    public boolean isPowerOfThree(int n) {
        // ITERATIVE APPROACH
//         if(n==0){
//             return false ;
//         }
//         while(n%3==0){
//             n=n/3;
//         }
        
//         if(n==1){
//             return true;
//         }
        
//         return false ;
        
        // --------------------------------------------------------------
            
            // USING RECURSION
        
        if(n==1){
            return true ;
        }
        
         if(n==0){
            return false ;
        }
        
         if(n%3!=0){
            return false ;
        }
        
        else return isPowerOfThree( n/3);
  
  
  
    
    }
}