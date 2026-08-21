class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;
        while(first < last){
            int calc = numbers[first] + numbers[last];
            if(calc > target){
                last--;
            }else if(calc < target){
                first++;
            }else{
                return new int[] { first+1, last+1 };
            }
        }
        return new int[] {};
    }
}
