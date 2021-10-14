
class Main {
    public static int maxSubArray(int[] nums) {
        int overall_sum = nums[0];
        int curr_sum = 0;

        for (int num : nums) {
            if (curr_sum < 0) {
                curr_sum = num;
            } else {
                curr_sum += num;
            }
            overall_sum = Math.max(overall_sum, curr_sum);
        }
        return overall_sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }
}