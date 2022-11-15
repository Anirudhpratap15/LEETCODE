class Solution {
    public int numberOfSteps(int num) {
        int count =0 ;
        
//         while(num>0){
            
//             if(num%2==0){
//                 num = num/2 ;
//                 count = count +1;
//             }
//              else {
//                 num = num -1  ;
//                 count = count +1;
//             }
//         }
//         return count  ;
        
        if(num==0){
            return count ;
        }
        
       else  if(num%2==0){
             count = count +1;
           return (numberOfSteps(num/2)+1);
        }
        
        // else if {
        count = count +1;
             return (numberOfSteps(num-1)+1);}
        // }
        
    }