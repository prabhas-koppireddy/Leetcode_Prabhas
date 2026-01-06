class Solution {

    public static boolean possible(int[] arr, int day, int m, int k){
        int count = 0, NoOfBouquets = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                NoOfBouquets += (count/k);
                count = 0;
            }
        }
        NoOfBouquets += (count/k);
        return NoOfBouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int n = bloomDay.length;
        int low = min, high = max, ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            boolean val = possible(bloomDay, mid, m, k);
            if(val == true){
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