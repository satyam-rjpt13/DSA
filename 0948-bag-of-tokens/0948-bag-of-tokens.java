class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l =0;
        int r = tokens.length-1;
        int score = 0;
        int ans =0;
        while(l<=r){
            if(power >= tokens[l]){
                power -= tokens[l];
                score++;
                ans = Math.max(ans,score);
                l++;
            }else if(score >= 1){
                power += tokens[r];
                score--;
                r--;
            }else{
                break;
            }
        }
        return ans;
    }
}