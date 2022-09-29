class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        List<Integer> lt=new ArrayList<>();
        for(int ele:arr){
            max=Math.max(ele,max);
            lt.add(ele);
        }
        return lt.indexOf(max);
        
    }
}