class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        //sorting array by 0th index ( starting interval )
     Arrays.sort(intervals,Comparator.comparingInt(o -> o[1]));
     int ans  =0 ; 
    
        //to store first interval's 1th index value to check in future if it is greater then next interval's 0th index         value then we have to reduce interval 
         int prev = intervals[0][1] ; 
       
        // this lool will start from first interval so it will compare prev value with itself  so we have reduce -1 from ans 
        for(int[] interval : intervals ){
            // when previous index is gretaer then second's 0th index 
            if(prev>interval[0]){
                 ans+=1;
            }
            else 
            {
             prev = interval[1];
               }
            
        }
        
        
        return --ans  ; 
        
    }
}