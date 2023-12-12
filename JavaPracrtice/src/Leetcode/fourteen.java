package Leetcode;

public class fourteen {
    public static void main(String[] args) {
        String str = "I am a Java Developer";
        String sub = str.substring(5,10);
        System.out.println(sub);

        String strs[] = {"flower", "flow", "flight"};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));

    }
}
