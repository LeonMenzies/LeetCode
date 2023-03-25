import java.util.Arrays;
import java.util.stream.IntStream;

public class PivotIndex {
    public int pivotIndexSolution1(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(Arrays.stream(nums, 0, i).sum() == Arrays.stream(nums, i + 1, nums.length).sum()){
                return i;
            }
        }
        return -1;
    }

    public int pivotIndexSolution2(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++){
            runningSum = runningSum + nums[i];
            if(sum - runningSum == runningSum - nums[i]){
                return i;
            }
        }
        return -1;
    }

    public int pivotIndexSolution3(int[] nums) {
        return recurisveIndex(nums, 0);
    }

    public int recurisveIndex(int[] nums, int sliceIndex){
        if (sliceIndex == nums.length){
            return -1;
        } else if(sumArray(sliceArray(nums, 0, sliceIndex)) == sumArray(sliceArray(nums, sliceIndex + 1, nums.length))){
            return sliceIndex;
        } else {
           return recurisveIndex(nums, sliceIndex + 1);
        }
    }

    public int sumArray(int[] nums){
        return Arrays.stream(nums).sum();
    }

    public int[] sliceArray(int[] nums, int startIndex, int endIndex){
        return Arrays.copyOfRange(nums, startIndex, endIndex);
    }



    public static void main(String[] args){
        System.out.println(new PivotIndex().pivotIndexSolution1(new int[]{1,7,3,6,5,6}));
        System.out.println(new PivotIndex().pivotIndexSolution2(new int[]{1,7,3,6,5,6}));
        System.out.println(new PivotIndex().pivotIndexSolution3(new int[]{1,7,3,6,5,6}));

    }
}

