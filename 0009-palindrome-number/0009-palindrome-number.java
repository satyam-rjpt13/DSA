class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int check = x;
        while(x>0){
            int temp = x%10;
            x/=10;
            sum = sum*10+temp;
        }
        return sum == check? true:false;

        
    }
}