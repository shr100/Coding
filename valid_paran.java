//Link : https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        boolean res = false;
        String[] str = s.split("");
        int flag = 0;
        for(int i=0;i<str.length;i++){
            if((str[i].equals("("))||(str[i].equals("["))||(str[i].equals("{"))){
                stack.push(str[i]);
            }
            else{
                
                if(str[i].equals(")")){
                    if((!stack.empty())&&(stack.peek().equals("("))){
                        stack.pop();
                        
                    }
                    else{
                        flag=1;
                    }
                }
                
                if(str[i].equals("]")){
                    if((!stack.empty())&&(stack.peek().equals("["))){
                        stack.pop();
                        
                    }
                    else{
                        flag=1;
                    }
                }
                
                if(str[i].equals("}")){
                    if((!stack.empty())&&(stack.peek().equals("{"))){
                        stack.pop();
                       
                    }
                    else{
                        flag=1;
                    }
                }
            }
        }
        
        if(stack.empty()){
            res = true;
        } 
        if(flag==1){
            res = false;
        }
            
            
        return res;
    }
}