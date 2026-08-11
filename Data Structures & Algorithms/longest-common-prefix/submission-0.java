class Solution {
    static String commonPrefixUtil(String str1, String str2){
        
        StringBuilder res = new StringBuilder();
        int n1 = str1.length();
        int n2 = str2.length();
         
        for(int i =0;i<n1 && i<n2;i++){

            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
            res.append(str1.charAt(i));
        }
        return res.toString();
    }
    static String commonPrefix(String arr [], int l, int r){

        if(l==r)
            return arr[l];   
        if(l<r){
            int mid = l +(r-l)/2;
        
        String p1 = commonPrefix(arr, l, mid);
        String p2 = commonPrefix(arr, mid+1, r);

        return commonPrefixUtil(p1,p2);
        }
        return "";

    }
    public String longestCommonPrefix(String[] strs) {
        return commonPrefix(strs,0,strs.length-1);
    }
}