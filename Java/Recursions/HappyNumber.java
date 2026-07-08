class Solution {
    public boolean isHappy(int n) {
        int result = 0;
        int x;
        if((n == 1) || (n == 7)){
            return true;
        }
        else if(n<10){
             return false;
        }
        else{
            while(n>0){
                x = n % 10;
                n = n / 10;
                result += x*x;
            }
        return isHappy(result);
        }
    }
}
