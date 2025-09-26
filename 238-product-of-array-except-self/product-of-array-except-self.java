class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i]=nums[i-1]*pre[i-1];
        }
        int suf=1;
        for(int i=n-2;i>=0;i--){
            suf*=nums[i+1];
            pre[i]*=(suf);
        }
        return pre;
    }
}