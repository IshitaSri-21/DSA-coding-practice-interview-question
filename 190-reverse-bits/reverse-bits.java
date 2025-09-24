class Solution {
    public int reverseBits(int n) {
       int i=0,j=31;
       while(i<j){
        int iMask=(1<<i), jMask=(1<<j);
        boolean iOn=((n&iMask)!=0);
        boolean jOn=((n&jMask)!=0);
        if(iOn!=jOn){
            n^=iMask;
            n^=jMask;
        }
        i++;
        j--;
       } 
       return n;
    }
}