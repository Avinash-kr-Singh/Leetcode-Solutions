class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int count=0;// assign a counter to keep track of given condition
        
        // apply nested loop with outer loop from 0 , and inner loop with the starting
        // with inner loop value + 1 (look at code)
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]== nums[j]) // condition according to question.
                    count++;
}
        }
         // return counter to function call.
        return count;
        
    }
}