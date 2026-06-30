class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int c = Integer.MAX_VALUE;
        int l =0;
        int r =0;
        int sum =0;
        while(r<n){
            sum += nums[r];
            while(sum >= target){
                int size = r-l+1;
                c = Math.min(c , size);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        if(c == Integer.MAX_VALUE) return 0;
        return c;
    }
}