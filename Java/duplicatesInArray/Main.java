// Your First Program

import java.util.ArrayList;
import java.util.List;

class Main {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] frequency = new int[100000];
        int highestNumber = 0; //short circuit

        for (int num :nums) {
            frequency[num] += 1;
            if (num > highestNumber) {
                highestNumber = num;
            }
        }

        for (int i = 0; i <= highestNumber; i ++) {
            if (frequency[i] >= 2) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}