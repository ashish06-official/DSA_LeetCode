class Solution {
    public int mySqrt(int x) {
        int mid = 0 , start = 0 ; 
        int end = x;
        if(x==0) return 0;
        if (x==1) return 1;
        while(start<=end){
            mid = (start + end)/2;
            if((mid*mid) > x){
                end = mid - 1;
            }
            else if ((mid*mid) == x){
                return mid;
            }
            else{
                start = mid+1;
            }
        }

        return Math.round(end);

    }
}
