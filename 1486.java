class Solution {
    public int xorOperation(int n, int start) {
        
        // defining an array with size n
        int[] nums = new int[n];
        
        int ans =0;//create a varibale for final solution
        
        for(int i=0;i<n;i++){// xor every element from index 0 to index last 
            
            nums[i]= start + 2 *i;// assigininf=g value to array (acc to question)
            
            ans ^=nums[i]; // xor every element of array or ans = ans ^ nums[i]
            
            // ^ -->> xor operator (at 6 in num row)
        }
        
        // return final ans to function
        return ans;
        
    }
}