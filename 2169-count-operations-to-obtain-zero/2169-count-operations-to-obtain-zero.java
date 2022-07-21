class Solution {
    public int countOperations(int num1, int num2) {
        
        int result = 0;
        int temp = 0;
        
        while(num1 != 0 && num2 != 0){
            result ++;
            
            if(num1 > num2){
                num1 -= num2;
            }else if(num1 < num2){
                num2 -= num1;
            }else{
                temp = num1;
                num1 -= temp;
                num2 -= temp;
            }   
        }
        
        return result;
        
    }
}