class Solution {
    public int removeElement(int[] nums, int val) {
        // initilzie pointer to iterate over a loop 
       int ptr =0;
        
        // of array is of size 1 then check it seprately
        if(nums.length == 1){
            if(nums[0] == val) return 0;
            else return 1;
        }
        
        // check the size of array and then make a varible to
        // update a size when val would be found
        int size = nums.length;
        int updated_size = size;
        
        
        // iterating loop
        for(int i=0;i<size;i++){
            
            // if elment is not equal  to  vale then copy value at nums[ptr]
            // then increment ptr
            if(nums[i] != val){
                nums[ptr] = nums[i];
                ptr++;
            }
            
            // and if its equal to val then redice array size by 1
            else{
                updated_size--;
            }
        }
        
        // return updated size to callee
        return updated_size;
        
    }
}