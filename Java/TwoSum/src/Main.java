import java.util.Arrays;

public class Main {
    /** this function check if the sum of any two numbers equals to target value and
     * returns the index of the two numbers
     *
     * @param nums Array of nums to check
     * @param target Target value used to compare the sums of two numbers
     * @return an array of the index of the two numbers whose sum equals to target value, else return null
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {

        int[] data = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(data, 9)));
    }
}
