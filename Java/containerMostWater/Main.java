class Main {
    public static int maxArea(int[] height) {
        int maxVol = 0;
        for (int i = 0; i < height.length - 1; i++) {
            //short circuit
            int maxWidth = Math.max(i, height.length - 1 - i);
            if (maxWidth * height[i] <= maxVol) continue;
            for (int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int currentVol = h * w;
                if (currentVol > maxVol) {
                    maxVol = currentVol;
                }
            }
        }
        return maxVol;
    }

    public static int maxArea2(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start < end) {
            int max = (end - start) * (Math.min(height[end], height[start]));
            maxArea = Math.max(maxArea, max);
            if (height[end] >= height[start]) {
                start++;
            } else end--;
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea2(array));
    }
}