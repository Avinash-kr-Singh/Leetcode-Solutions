class Solution {
    public int fib(int n) {
        
        // we don't need to worry for every task
        // we have to tell compiler how to perform opeartion on
        // smaller number and rest recursion will take care of
        
        
        // base case (smaller task )
        if(n<=1) return n;
        
        // recursion is taking care 
        else
            // as we know fib of n van be written as product of previous two 
            // fibonacci so let compiler do the work
            
            // calling function will smaller task
            return fib(n-2)+ fib(n-1);
        
    }
}