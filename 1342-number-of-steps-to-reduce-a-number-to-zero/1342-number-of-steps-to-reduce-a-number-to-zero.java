class Solution {
    public int numberOfSteps(int num) {
        
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
            return 0 ;
        }
        
       else  if(num%2==0){
           return (numberOfSteps(num/2)+1);
        }
             return (numberOfSteps(num-1)+1);}
        
    }