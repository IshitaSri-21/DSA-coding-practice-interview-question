class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length,m=queries.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
            int[] ans=new int[m];
            for(int j=0;j<m;j++){
                int lo=0,hi=n-1;
                while(lo<=hi){
                    int mid=lo+(hi-lo)/2;
                    if(nums[mid]>queries[j]){
                    hi=mid-1;
                    }
                    else{
                    ans[j]=Math.max(ans[j],mid+1);
                    lo=mid+1;
                }
            }
        }
        return ans;
    }
}