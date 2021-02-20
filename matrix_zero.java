//Link: https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        int k = 0,l=0,i=0,j=0;
        for(i =0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                temp[i][j] = matrix[i][j];
            }
        }
        
        for(i =0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(temp[i][j] == 0){
                    k=0;
                    l=0;
                    while(k<matrix.length){
                        matrix[k][j] = 0;
                        k++;
                    }
                    while(l<matrix[0].length){
                        matrix[i][l] = 0;
                        l++;
                    }
                }
                else{
                   continue; 
                }
            }
        }
    }
}