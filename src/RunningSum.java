import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RunningSum {
    public int[] runningSum(int[] nums) {
//        int[] toReturn = new int[nums.length];
//        toReturn[0] = nums[0];
//        for(int i = 1; i < nums.length; i++){
//            toReturn[i] = nums[i] + toReturn[i - 1];
//        }
//        return toReturn;

        Arrays.parallelPrefix(nums, Integer::sum);
        return nums;
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(new RunningSum().runningSum(new int[]{1,2,3,4})));
    }
}

