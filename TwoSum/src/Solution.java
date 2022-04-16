import java.util.ArrayList;

class Solution {

    private ArrayList
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
    int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target ){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int[] indices = twoSum(nums, target);

        for(int i = 0 ; i< indices.length; i++){
            System.out.print(indices[i] + " ");
        }
    }
}