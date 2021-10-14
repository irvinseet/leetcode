
class Main {
    public static boolean containsDuplicate(int[] nums) {
        int max = 0;
        int min = 0;
        for (int num : nums) {
            if (num > max) max = num;
            else if (num < min) min = num;
        }

        int[] freq = new int[max + 1];
        int[] negFreq = new int[min * (-1) + 1];

        for (int num : nums) {
            if (num < 0) {
                negFreq[-1 * num]++;
                if (negFreq[-1 * num] > 1) return true;
            } else {
                freq[num]++;
                if (freq[num] > 1) return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(array));
    }
}