class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for(int num:piles){
            maxPile = Math.max(maxPile,num);
        }
        int left = 1;
        int right = maxPile;
        int ans = maxPile;

        while( left <= right ){
            int k = left + (right-left)/2;
            long hours = 0;
            for(int pile:piles){
                hours += (pile + k-1)/k;
            }
            if(hours<=h){
                ans = k;
                right=k-1;
            }else{
                left = k+1;
            }
        }
        return ans;
        
    }
}