class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =sum(x);
        if(x % sum == 0){
            return sum;
        }else{
            return -1;
        }
        
    }
    public int sum(int x){
        int add= 0;
         while(x>0){
            int digit = x % 10;
            add+= digit;
            x/=10;
        }
        return add;
        
    }
}