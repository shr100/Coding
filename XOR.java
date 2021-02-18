//Leetcode link : https://leetcode.com/problems/xor-queries-of-a-subarray/
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length]; 
        int a,b,temp;
        for(int i=0;i<queries.length;i++){
            temp = 0;
            a = queries[i][0];
            b = queries[i][1];
            if(a==b){
                temp = arr[a];
            }
            else{
            for(int j=a;j<=b;j++){
                temp = temp ^ arr[j];
            }
            
            }
        
            res[i] = temp;
        }
        
        return res;
    }
}