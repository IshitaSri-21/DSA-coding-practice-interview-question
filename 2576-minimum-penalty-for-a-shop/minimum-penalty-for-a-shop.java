class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] pre=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1];
            if(customers.charAt(i-1)=='N') pre[i]+=1;
        }
        int[] suf=new int[n+1];
        for(int i=n-1;i>=0;i--){
            suf[i]=suf[i+1];
            if(customers.charAt(i)=='Y') suf[i]+=1;
        }
        int[] penalty=new int[n+1];
        int min=n+5;
        for(int i=0;i<=n;i++){
           pre[i]+=suf[i];
           min=Math.min(min,pre[i]);
        }
          for(int i=0;i<=n;i++){
            if(pre[i]==min) return i;
    }
    return 3525;
    }
}