class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minO = Integer.MAX_VALUE;

        for(int i =0;i<=n-k;i++){
            int whiteC = 0;

            for(int j =i;j<i+k;j++){
                if(blocks.charAt(j) == 'W'){
                    whiteC++;
                }
            }
            minO = Math.min(minO,whiteC);
        }
        return minO;
    }
}