class Solution {
    public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int c=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                  c+=(Math.abs(i-j));  
                }
            
            }
            ans[i]=c;
        }
        return ans;
    }
}