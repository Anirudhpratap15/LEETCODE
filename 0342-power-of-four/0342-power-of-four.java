class Solution {
    public boolean isPowerOfFour(int n) {
        //base condition
         if(n==1){
        return true ;
    }
     //base condition
     if(n==0){
        return false ;
    }
     //base condition
     if(n%4!=0){
        return false ;
    }
    
        //recursion
    else return isPowerOfFour( n/4);
        
    }
}