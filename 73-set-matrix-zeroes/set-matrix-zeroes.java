class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
//marking particular row and col
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(arr[i][j]==0){
            row[i]=true;
            col[j]=true;
        }
    }
}
//set true rowa to 0
for(int i=0;i<m;i++){
    if(row[i]==true){
        for(int j=0;j<n;j++){
            arr[i][j]=0;
        }
    }
}
//set true col to 0
for(int j=0;j<n;j++){
    if(col[j]==true){
        for(int i=0;i<m;i++){
            arr[i][j]=0;
        }
    }
}
    }
}