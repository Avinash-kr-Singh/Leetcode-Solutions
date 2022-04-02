class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // create a varible t0 count 
        int count=0;
        
        
        // iterate through string (first string)
        for(int i=0;i<jewels.length();i++)
            // iterate through string ( second string)
            for(int j=0;j<stones.length();j++)
                // if both strings are equal then increment the count
                if(jewels.charAt(i) ==  stones.charAt(j))
                    count++;
            
        
        // return count
        return count;
        
    }
}