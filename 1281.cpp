class Solution {
public:
    int subtractProductAndSum(int n) {
        // assign two varibale for prodcut and sum
        // donot initialize product varibale with 0 as net product will become 0.
        int pro=1, sum=0;
        
        // assign a remainder var to find the remainder 
        // remainder will be used for calculating product and sum ( d=digit by digit)
        int rem=0;
        
        while(n!= 0){// run while our number is not equal to o
            
            rem= n%10; // this will give remainder of n
            
            pro= pro * rem; // multiplying the remainder with product varible
            
            sum= sum + rem;// adding the remainder with sum varible
            
            
            n= n/10;// making n less so our base condition would be reached 
            // IMPORTANT of reduce the value of n else lo0p will be infinte
        }
        
        // find difference of product and sum
        int res= pro - sum;
        
        // return ans to callee
        return res;
        
    }
};