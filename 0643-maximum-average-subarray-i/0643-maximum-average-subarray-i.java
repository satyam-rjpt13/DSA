class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i =0;
        int j =0 ;
        double avgMax = 0;
        
        while(j<nums.length){
            sum += nums[j];
            if(j-i+1!= k){
                j++;
            }else{
                max = Math.max(sum,max);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        avgMax = (double) max/k;
        return avgMax;
        
    }
}