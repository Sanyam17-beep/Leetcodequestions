class Solution {
    public int maximum69Number (int num) {
        var t=(String.valueOf(num)).toCharArray();
        for(int i=0;i<t.length;i++){
            if(t[i]=='6'){
                t[i]='9';
                break;
            }
        }
        String str=new String(t);
        return Integer.parseInt(str);
    }
}