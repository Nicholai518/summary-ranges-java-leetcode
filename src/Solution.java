import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        // result to be returned
        List<String> list = new ArrayList<>();

        int sizeOfNums = nums.length;

        // iterate through array
        for (int i = 0; i < sizeOfNums; i++) {

            // start of the range
            int start = nums[i];

            // checking to make sure there is a next element / number available
            // and
            // checking if the next element is a continuation of our range
            while (i + 1 < sizeOfNums && nums[i + 1] == nums[i] + 1) {
                // increment i
                i++;
            }

            // if there are multiple numbers within our range
            // add to list of ranges
            if (start != nums[i]) {
                list.add("" + start + "->" + nums[i]);
            }

            // if there is just a single number for the range
            // add to list of ranges
            else {
                list.add("" + start);
            }
        }

        // return ranges
        return list;
    }
}
