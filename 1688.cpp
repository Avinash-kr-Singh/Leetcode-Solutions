class Solution {
public:
    int numberOfMatches(int n) {
        // create a counter to keep track of work done 
        
        // initialization in better because it would not store garbage value
        int count=0;
        
        while(n != 1){// run loop till n doesn't become 0 (acc to question)
            //EVEN
            if( n % 2 == 0){// when n is even
                
                count = count + n/2; //  (acc to question)
                
                n = n/2;//(acc to question)
            }
            
            //ODD
            else{// when n is odd
                
                count = count + (n-1)/2 ;//(acc to question)
                n = (n-1)/2 + 1;//(acc to question)
            }
        }
        
        // return the tracker to callee function.
        return count;
        
    }
};