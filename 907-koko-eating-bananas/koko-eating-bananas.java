class Solution {

    public static int largest(int[] piles){
        int large = piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i] > large){
                large = piles[i];
            }
        }
        return large;
    }

    public static long hours(int[] piles, int hourly){
        long totalHours = 0;
        for(int i=0;i<piles.length;i++){
            totalHours += (long)Math.ceil((double)piles[i]/hourly);
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = largest(piles);
        int low = 1, high = max, ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            long val = hours(piles,mid);
            if(val <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}