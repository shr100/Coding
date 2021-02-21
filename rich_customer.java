//Link: https://leetcode.com/problems/richest-customer-wealth/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0,i=0,j=0;
        if(accounts.length > 1){
        for(i=0;i<accounts.length;i++){
            
            int inter = 0;
            if(accounts[1].length > 1){
            for(j=0;j<accounts[0].length;j++){
                inter = inter+accounts[i][j];   
            }
            }
            else{
                inter = inter+accounts[i][0]; 
            }
            if(sum<inter){
                    sum = inter;
                }
        }
        }
        else{
            while(j<accounts[0].length){
                System.out.println("yo");
                sum = sum + accounts[0][j];
                j++;
            }
        }
        return sum;
    }
}