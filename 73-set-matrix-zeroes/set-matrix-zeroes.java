class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        int[][] dup=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dup[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dup[i][j]==0){
                    for(int b=0;b<n;b++){
                        arr[i][b]=0;
                    }
                    for(int a=0;a<m;a++){
                        arr[a][j]=0;
                    }
                }
            }
        }
    }
}