class Solution {
    public int[] findErrorNums(int[] nums) {
     Set<Integer> st=new HashSet<>();
        int max=-1;
        int temp=-1;
        for(int ele:nums){
            if(st.contains(ele)){
                temp=ele;
                }
            max=Math.max(max,ele);
            st.add(ele);
            
        }
        int te=-1;
        for(int i=1;i<max;i++){
            if(!st.contains(i))te=i;
        }
        if(te==-1)te=nums.length;
        return new int[]{temp,te};
    }
}