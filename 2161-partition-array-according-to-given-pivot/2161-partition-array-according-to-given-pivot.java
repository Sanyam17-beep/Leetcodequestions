class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
          int small=0,greater=0,equal=0;
        for(int i:nums){
            if(i < pivot)small++;
            else if(i > pivot) greater++;
            else equal++;
        }
        int result[]=new int[nums.length];
        int i=0;
        int l=0,e=small,r=small+equal;
        while(i < nums.length){
            if(nums[i] < pivot) result[l++]=nums[i];
            else if(nums[i] > pivot)result[r++]=nums[i];
            else result[e++]=nums[i];
            i++;
        }
        
        return result;
    }
}