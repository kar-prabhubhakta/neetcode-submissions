class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       List<List<String>> ans = new ArrayList<>();
       HashMap<String,Integer> map = new HashMap<>();

       for(int i = 0; i < strs.length ; i++){

            String s = strs[i];
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted,ans.size());
                ans.add(new ArrayList<>());
            }
            ans.get(map.get(sorted)).add(s);
       }
       return ans;
    }
}
