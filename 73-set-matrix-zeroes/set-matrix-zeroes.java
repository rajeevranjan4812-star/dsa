class Solution {
    public void setZeroes(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int res[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                res[i][j] = mat[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(res[i][j] == 0){
                    for(int k=0; k<c; k++){
                        mat[i][k] = 0;
                    }
                    for(int k=0; k<r; k++){
                        mat[k][j] = 0;
                    }
                }
            }
        }
}
}