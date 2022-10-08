class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0,n=0;
        for(int ele:nums){
            if(ele<0){
                n++;
            }
            else{
                p++;
            }
        }
        int []po=new int[p];
        int []ne=new int[n];
        int k=0,l=0;
         for(int ele:nums){
              if(ele<0){
                po[k++]=ele;
            }
            else{
              ne[l++]=ele;
            } 
         }
        int ans[]=new int[nums.length];
        k=0;l=0;
        for(int i=0;i<ans.length;i++){
            if(i%2!=0){
              ans[i]= po[k++]; 
            }
            else{
                ans[i]=ne[l++];
            }
        }
        return ans;
    }
}