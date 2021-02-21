//Link: https://leetcode.com/problems/roman-to-integer/
import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> hash=new HashMap<String,Integer>(); 
        hash.put("I",1);
        hash.put("V",5);
        hash.put("X",10);
        hash.put("L",50);
        hash.put("C",100);
        hash.put("D",500);
        hash.put("M",1000);
        String[] str = s.split("");
        int c=0;
        int i=0;
        while(i<str.length){
            if(i==str.length-1){
                c = c+hash.get(str[i]);
                break;
            }
            if(hash.get(str[i])<hash.get(str[i+1])){
                c = c+(hash.get(str[i+1])-hash.get(str[i]));
                i = i+2;
            }
            else{
                c = c+hash.get(str[i]);
                i++;
            }
        }
        return c;
    }
}