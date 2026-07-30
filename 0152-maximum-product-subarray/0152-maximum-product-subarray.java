class Solution {
    public int maxProduct(int[] nums) {
        int preff=1;
        int suff=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(preff==0) preff=1;
            if(suff==0) suff=1;


            preff=preff*nums[i];
            suff=suff*nums[n-i-1];
            ans=Math.max(ans,Math.max(preff,suff));

        }
        return ans;
        
    }
}