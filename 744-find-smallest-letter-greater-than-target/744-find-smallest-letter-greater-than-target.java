class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int start = 0;
        int end = letters.length-1;
        
        while (end>=start){
            int mid= start +(end-start)/2;
            if(target>=letters[letters.length-1]){
                return letters[start];
            }
            
            if(target>=letters[mid]){
                start = mid+1;
            }
            else end = mid -1;  
            
        }
        return letters[start];
    }
        
    
}