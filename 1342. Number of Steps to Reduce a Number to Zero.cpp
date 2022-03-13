class Solution {
public:
    int numberOfSteps(int num) {
        
        // to keep track of work done create a counter 
        int count=0;
        
        
        while(num){// run a loop till our number is greater than 0
            
            if(num % 2 == 0){// if even 
                
                num /=2;// divide number by 2 (acc to question) or num = num /2
                
                count++;// increase counter as we are doing some work here
            }
            else{// if num is odd 
                
                num -=1;// decrease number by 1 (acc to question) or num = num -1
                
                
                count++;// increase counter as we are doing some work here
            }
        }
        
        // return the tracker to callee function.
        return count;
        
    }
};