//Link: https://leetcode.com/problems/shuffle-string/
class Solution {
    public String restoreString(String s, int[] indices) {
        String[] str = s.split("");
        String finalstr = "";
        int i=0;
        int j=0;
        while(j<s.length()){
            
            if(indices[i]==j){
                finalstr = finalstr+str[i];
                j++;
                i=0;
            }
            else{
                i++;
            }
        }
        return finalstr;
    }
}