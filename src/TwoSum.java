import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}

