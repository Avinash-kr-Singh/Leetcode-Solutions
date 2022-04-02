class Solution {
    public int countKDifference(int[] nums, int k) {
        // create a counter for counting same diff
        int count=0;
        
        // iterate through loop
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // if diff is k then count++
                if(nums[i] - nums[j] == k) count++;
                
                // if diff is -k then count++
                if(nums[j] - nums[i] == k) count++;
            }
        }
        
        // return ans to callee
        return count;
        
    }
}