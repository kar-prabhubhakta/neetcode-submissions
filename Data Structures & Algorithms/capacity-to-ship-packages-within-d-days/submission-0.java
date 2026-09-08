class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();
        int res = r;

        while(l<=r){

            int mid = l + (r-l)/2;

            if(canShip(weights,mid,days)){

                res = Math.min(res,mid);
                r = mid-1;

            } else{

                l = mid+1;

            }
        }
        return res;
    }

    private boolean canShip(int [] weights, int cap, int days){
        int usedDays = 1, currentLoad =0;

        for(int weight : weights){
            if(currentLoad + weight > cap){
                currentLoad = 0;
                usedDays++;
            }
            currentLoad += weight;
        }
        return usedDays <= days;
    }
}