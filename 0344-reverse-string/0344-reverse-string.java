class Solution {
    public void reverseString(char[] s) {
        int start = 0 ;
        int end  = s.length-1 ;
        reverse(s,start,end);
        
        
    }
    
    public char[] reverse(char[] s,int start ,int end ){
        
        //base condition
        if(start>=end ){
            return new char[]{} ;  // 
        }
        swap(s ,start,end );
      return  reverse(s,++start,--end); //recursion 
        
    }
    
    //swap the char from start and last index
     public void swap(char[] s,int start ,int end ){
         
         char temp = s[start];
         s[start] = s[end];
         s[end] = temp;
     }
    
}