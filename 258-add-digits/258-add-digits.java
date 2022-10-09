class Solution {
    public int addDigits(int num) {
        int c=Integer.MAX_VALUE;
     while(c>9){
     
         int sum=0;
         
         while(num!=0){
             int t=num%10;
             sum+=t;
             num=num/10;
         }
        
         c=sum;
            num=c;
     }
        return c;
    }
}