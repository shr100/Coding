//Link : https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String[] str = s.split("");
        for(int i=0;i<str.length;i++){
            if(!(str[i].toLowerCase()).equals(str[str.length-(i+1)].toLowerCase())){
                return false;
            }
        }
        return true;
        
    
    }
}