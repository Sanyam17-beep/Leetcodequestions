class Solution {
    public String oddString(String[] words) {
        int n=words[0].length();
        String[] diff=new String[words.length];
        for(int i=0;i<words.length;i++){
            diff[i]="";
            for(int j=1;j<n;j++){
                int c=words[i].charAt(j)-words[i].charAt(j-1);
                diff[i]+=c;
                diff[i]+=" ";
                
            }
        }
      Map<String, Integer> mp= new HashMap<String, Integer>();
        for (String c : diff) {
            if (mp.containsKey(c)) {
 
                mp.put(c, mp.get(c) + 1);
            }
            else {
                mp.put(c, 1);
            }
        }
        String temp="";
       
         for (Map.Entry e : mp.entrySet()) {
             if((int)(e.getValue())==1){
                 temp=(String)e.getKey();
             }
        }
        String res="";
        for(int i=0;i<diff.length;i++){
            if(temp.equals(diff[i])){
res=words[i];
                break;
            }
        }
        return res;
    }
}