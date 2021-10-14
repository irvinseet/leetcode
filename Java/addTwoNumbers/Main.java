class Main {

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        if (s.length () == 1) return 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int temp = 1;
            int array[] = new int[256];
            array[s.charAt(i)] += 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (array[s.charAt(j)] == 1) break;
                else {
                    array[s.charAt(j)] += 1;
                    temp += 1;
                }
            }
            if (temp > longest) longest = temp;
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}