/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
        if(root==null)return 0;
        int r=0;
        Queue<TreeNode> qu=new LinkedList<TreeNode>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            ArrayList<Integer>ar=new ArrayList<>();
            int n=qu.size();
            for(int i=0;i<n;i++){
         TreeNode temp=qu.poll();
            ar.add(temp.val);
            if(temp.left!=null){
                qu.add(temp.left);
            }
            if(temp.right!=null){
                qu.add(temp.right);
            }
                }
            
            r+=min(ar,n);
        }
        return r;
    }
    int min(ArrayList<Integer>ar,int n){
        int res=0;
       ArrayList<Integer>arr=new ArrayList<>();
    for(int i=0;i<ar.size();i++){
arr.add(ar.get(i));
    }
        Map<Integer,Integer>mp=new HashMap<>();
        Collections.sort(arr);
        for(int i=0;i<n;i++){
            mp.put(ar.get(i),i);
        }
        int []a=ar.stream().mapToInt(i -> i).toArray();;
        int []tt=arr.stream().mapToInt(i -> i).toArray();;
        for(int i=0;i<n;i++){
            if(a[i]!=tt[i]){
          
                res++;
                
                int t=a[i];
                sw(a,i,mp.get(tt[i]));
                mp.put(t,mp.get(tt[i]));
                   mp.put(tt[i],i);
            }
        }
        return res;
    }
    void sw(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}