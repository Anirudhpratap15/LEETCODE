class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0 ; i <ransomNote.length();i++){
        char r = ransomNote.charAt(i);
          int   magIndex = -1 ;
            magIndex = magazine.indexOf(r); 
            
            if(magIndex==-1) return false ;
    magazine =  magazine.substring(0,magIndex) + magazine.substring(magIndex+1);
        }
        return true ;
        
    }
}