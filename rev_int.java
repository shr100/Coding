//Link: https://leetcode.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        int pop;
        int rev=0;
        while((x>0)||(x<0)){
            pop = x%10;
            x = x/10;
            
            
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = (rev*10) + pop;
            
            
        }
        return rev;
    }
}