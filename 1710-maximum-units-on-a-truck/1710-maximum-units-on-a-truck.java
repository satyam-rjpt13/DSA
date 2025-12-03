class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int profit = 0;

        for(int i=0;i<boxTypes.length;i++){
              int start = boxTypes[i][0];
              int end = boxTypes[i][1];


              if(truckSize>=start){
                profit += start*end;
                truckSize -=start;
              }else{
                profit += truckSize*end;
                truckSize =0;
              }
              
        
            
        }
        return profit;
    }
}