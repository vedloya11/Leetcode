class Solution {
    public long sumAndMultiply(int n) {
        long x =0;
        long sum =0;
        long digit = 1;
        while(n != 0){
            x = (n%10) *digit +x; 
            if(n%10 !=0){
                digit*=10;
                sum+=n%10;
            }
            n/=10;
        }
        return sum * x;
        
    }
}