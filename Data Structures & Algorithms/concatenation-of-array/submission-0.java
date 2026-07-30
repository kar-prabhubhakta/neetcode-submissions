class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int ans [] = new int [length*2];
        int anslength = 2*length;
        for(int i = 0 ; i < anslength ; i++ ){

            if(i<length){
                ans[i]= nums[i];
            }else{
                ans[i]= nums[i-length];
            }
        }
        return ans;
    }
}