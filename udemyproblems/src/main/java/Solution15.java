class Solution15 {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int preMin = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            ans = Math.max(ans, sum - preMin);
            preMin = Math.min(preMin, sum);
        }
        return ans;
    }
}
