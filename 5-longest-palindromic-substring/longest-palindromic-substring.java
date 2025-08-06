class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String maxStr=s.substring(0,1);

        for(int i=0;i<s.length()-1;i++){
            String odd=expandFromCenter(s,i,i);
            String even=expandFromCenter(s,i,i+1);

            if(odd.length()>maxStr.length()){
                maxStr=odd;
            }
            if(even.length()>maxStr.length()){
                maxStr=even;
            }
        }
        return maxStr;
    }
    private String expandFromCenter(String s,int i,int j){
        while(i>=0 && j< s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}
           