// Leetcode link : https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/808/

class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] ans = new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            ans[i][0] = 1;
        }
        for(j=0;j<n;j++){
            ans[0][j] = 1;
        }
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                ans[i][j] = ans[i][j-1] + ans[i-1][j];
            }
        }
        return ans[m-1][n-1];
    }
}
