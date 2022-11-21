class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
            if(nums[i]<=0)
                nums[i] = Integer.MAX_VALUE - 3;
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i]) - 1;
            if(index >= n)
                continue;
            nums[index] = -Math.abs(nums[index]);
        }
        
        int ans = n+1;
        for(int i=0;i<n;i++)
            if(nums[i]>=0){
                ans = i+1;
                break;
            }
        return ans;
    }
}