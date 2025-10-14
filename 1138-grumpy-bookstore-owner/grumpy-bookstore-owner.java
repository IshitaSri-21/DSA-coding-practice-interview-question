class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n=arr.length, i=0,j=k-1,unSatisfied=0;
        int a=i,b=j,maxUnsatisfied=0;
        for(int x=i;x<=j;x++){
            if(grumpy[x]==1) unSatisfied+=arr[x];
        }
        while(j<n){
            if(maxUnsatisfied<unSatisfied){
                maxUnsatisfied=unSatisfied;
                a=i; b=j;
            }
            i++;
            j++;
            if(j<n && grumpy[j]==1) unSatisfied+=arr[j];
            if(grumpy[i-1]==1) unSatisfied-=arr[i-1];
        }
        for(int x=a;x<=b;x++){
           grumpy[x]=0;
        }
        int satisfied=0;
        for(int x=0;x<n;x++){
            if(grumpy[x]==0) satisfied+=arr[x];
        }
        return satisfied;
    }
}