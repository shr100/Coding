// Leetcode link : https://leetcode.com/problems/zigzag-conversion/
class Solution {
    public String convert(String s, int numRows) {
        
        if((s.length()==1)||(numRows==1)||(s.length()<=numRows)){
            return s;
        }
        
        String finalstr = "";
        if(s.length()%2==0){
            String[][] arr = new String[numRows][s.length()/2];
        String[] str = s.split("");
        
        int k=0,i=0,j=0;
        
        while((i<numRows)&&(j<arr[0].length)&&(k<s.length())){
            if(j%(numRows-1)==0){
                if(i>0){
                    i--;
                }
                while((i<numRows)&&(k<s.length())){
                arr[i][j] = str[k];
                k++;
                i++;
                }
                i--;
                j++;
            }
            else{
                i--;
                //j++;
                arr[i][j] = str[k];
                k++;
                j++;
            }
        }
    
        
        
        
        
        for(int h=0;h<numRows;h++){
            int l=0;
            while(l<arr[0].length){
                if(arr[h][l]!=null){
                finalstr = finalstr+arr[h][l];
                
                }
        l++;
            }
        }
        return finalstr;
            
        }
        else{
            String[][] arr = new String[numRows][(s.length()/2) + 1];
        String[] str = s.split("");
        
        int k=0,i=0,j=0;
        
        while((i<numRows)&&(j<arr[0].length)&&(k<s.length())){
            if(j%(numRows-1)==0){
                if(i>0){
                    i--;
                }
                while((i<numRows)&&(k<s.length())){
                arr[i][j] = str[k];
                k++;
                i++;
                }
                i--;
                j++;
            }
            else{
                i--;
                //j++;
                arr[i][j] = str[k];
                k++;
                j++;
            }
        }
    
        
        
       
        
        
        
        for(int h=0;h<numRows;h++){
            int l=0;
            while(l<arr[0].length){
                if(arr[h][l]!=null){
                finalstr = finalstr+arr[h][l];
                
                }
        l++;
            }
        }
        return finalstr;
        }
    }
}