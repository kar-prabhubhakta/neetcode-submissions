class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows = matrix.length - 1;
        int column = matrix[0].length - 1;
        int i = 0;
        int second [] = {};
        while(i <= rows){

            if(matrix[i][column] < target){

                i++;

            }else{
                second = matrix[i];
                break;
            }
        }
        int left =0;
        int right = second.length-1;
        while(left <= right){

            int mid = left + (right-left)/2;

            if(second[mid] == target){
                return true;
            } else if (second[mid] > target) {
                right = mid -1;

            }else {
                left = mid +1;
            }
        }
        return false;
    }
}
