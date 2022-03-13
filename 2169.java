class Solution {
    public int countOperations(int num1, int num2) {
        
        int count=0; //assign a counter to count the number of arithmetic opeartions performed
        while(num1 !=0 && num2 !=0){// check till any one of them become 0
            
            if( num1>= num2){// according to question.
                num1 = num1 - num2;
                count++;    }
            
            else{
               num2 = num2  - num1;
               count++;
             }
        }
        // return counter to function 
        
        return count;
        
    }
}