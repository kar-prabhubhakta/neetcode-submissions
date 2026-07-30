class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> diffrenceMap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            Integer difference = target - nums[i];
            Integer diffIndex = diffrenceMap.get(difference);

            if(diffIndex != null){
                return new int []{diffIndex,i};
            }
            diffrenceMap.put(nums[i],i);
    
    }
    return new int []{};

  }
}
