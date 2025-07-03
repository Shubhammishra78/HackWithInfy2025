import java.util.Arrays;

public class Array_partition {
  public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max_sum =0;
        for(int i=0;i<nums.length-1;i+=2){
            max_sum = max_sum + Math.min(nums[i],nums[i+1]);
        }
        return max_sum;
    }
  public static void main(String[] args) {
    int nums[] = {1,4,3,2};
    arrayPairSum(nums);
  }
}
