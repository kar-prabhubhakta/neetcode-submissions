class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(ele-> set.add(ele));
        if(set.size() == nums.length){
            return false;
        }
        
        return true;
    }
}