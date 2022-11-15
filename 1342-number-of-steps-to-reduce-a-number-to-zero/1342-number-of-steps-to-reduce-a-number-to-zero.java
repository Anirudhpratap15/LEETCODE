class Solution {
    public int numberOfSteps(int num) {
        //base condition 
        if(num==0){return 0;}
        
         //base condition  for even 
        else if(num%2==0){
            return (numberOfSteps(num/2)+1);// recursion   +1 is count as recurion return 0 at last 
        }
        
        //odd
         return (numberOfSteps(num-1)+1);  // recursion     +1 is count as recurion return 0 at last 
        
    }
}