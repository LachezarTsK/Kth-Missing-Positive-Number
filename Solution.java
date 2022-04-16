
public class Solution {

    public int findKthPositive(int[] input, int k_missingPositiveInt) {
        if (input[0] > k_missingPositiveInt) {
            return k_missingPositiveInt;
        }

        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (input[mid] - mid - 1 < k_missingPositiveInt) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        /*
        At this point:
        right = left + 1;
        input[right] + k_missingPositiveInt - (input[right] - right - 1) = left + k_missingPositiveInt;
         */
        return left + k_missingPositiveInt;
    }
}
