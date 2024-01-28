//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
       ArrayList<Integer>temp=new ArrayList<>();
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<n;i++){
          if(map.containsKey(arr[i])){
              map.put(arr[i],map.get(arr[i])+1);
          }
          else 
          map.put(arr[i],1);
      }
      
       for(Integer i:map.keySet()){
           if(map.get(i)>1)
           temp.add(i);
       }
       if(temp.isEmpty()){
           temp.add(-1);
       }
       Collections.sort(temp);
       return temp;


    }
}
