class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int count = k;
        long sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int i = happiness.length-1;
        while(count>0){
            list.add(Math.max(happiness[i] - (k - count), 0));
            count--;
            i--;
        }
        for(int j = 0;j<list.size();j++){
            sum+=list.get(j);
        }
        return sum;
    }
}