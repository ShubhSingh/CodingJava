class 3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int res = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length - 2; i++) {
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                if(Math.abs(target-sum) < Math.abs(target-res)) res = sum;
                
                if(sum < target)
                    j++;
                else
                    k--;
            }
        }
        return res;
    }
}
