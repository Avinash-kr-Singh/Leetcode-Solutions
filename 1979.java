class Solution {
    public int findGCD(int[] nums) {
        
    // assign max value with lowest value of integer
        // assign min value with the highest possible value of integer
        
        // keeping range of int in mind
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
        
        // find max and min value in array (acc to question) 
      for (int element : nums) {
              max = Math.max(max, element);
              min = Math.min(min, element);
          }
        
        // create a varible and by default it will return 1 bc 
        // if no other value would be possible the 1 willl be ans (corner case) 
        int ans=1;
        
        // running loop from min value bc gcd will be always less than or
        // equal to the lesser number or greater than or equal to 1
        for(int i= min; i>0;i--){
            
            // if both are divisble then it will be gcd
            if(max % i ==0  && min %i ==0){
                ans = i; // if found assign it to ans varible
                
                break;// break is IMPORTANT because we need lager number which divides both num
                // if we don't use break it will always give 1  an ans
            }
        }
        
        // return  tracker to callee 
        return ans;
    }
}