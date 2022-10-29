class Solution {
    public boolean search(int[] a, int t) {
              int s = 0;
        int e = a.length - 1;
        
        while(s <= e) {
            while ((s+1 <= e) && (a[s] == a[s+1])) {
                s++;
            }
            while ((s <= e-1) && (a[e] == a[e-1])) {
                e--;
            }
            
            int mid = s + (e-s) / 2;
            if(a[mid] == t) return true;
            if(a[s] <= a[mid]) { 
                if(t >= a[s] && t < a[mid]) e = mid-1;
                else s = mid+1;
            } else {
                if(t > a[mid] && t <= a[e]) s = mid+1;
                else e = mid-1;
            }
        }
        return false;
    }
}