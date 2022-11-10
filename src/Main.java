import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleOne = {0, 1, 2, 4, 5, 7};
        List<String> answer = solution.summaryRanges(exampleOne);

        System.out.print("Example One: ");
        for (String s : answer) {
            System.out.print(s + " ");
        }
    }
}
