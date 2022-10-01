class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       int n1=0;
        int n2=0;
         int res=0;
        for(int i=0;i<nums1.length;i++){
            n1^=nums1[i];
        }
         for(int i=0;i<nums2.length;i++){
           n2^=nums2[i];
        }
       if(nums1.length%2==1&&nums2.length%2==0)res=n2;
        else if(nums1.length%2==0&&nums2.length%2==0)res=0;
        else if(nums1.length%2==1&&nums2.length%2==1)res=n1^n2;
        else if(nums1.length%2==0&&nums2.length%2==1)res=n1;
        return res;
    }
}