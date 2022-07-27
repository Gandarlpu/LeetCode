class Solution {
    public void reverseString(char[] s) {
        
       
        char temp;
        char temp2;
        
        for(int i = 0 ; i < s.length/2 ; i ++){
            temp = s[i];
            temp2 = s[s.length-1-i];    
        
            s[i] = temp2;
            s[s.length-1-i] = temp;
        }
        
        
    }
}