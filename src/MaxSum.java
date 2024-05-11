public class MaxSum {
    public static void main(String[] args) {
        System.out.println(getMaxSum(new int[]{1, 4, 5, 6, 7, 0, 8, -1, 9}, 0, 8));
    }

    public static int getMaxSum(int[] ints, int left, int right) {
        if (right == left) {
            return Math.max(ints[left], 0);
        }
        int maxLeftBroaderSum = 0;
        int leftBroaderSum = 0;
        int rightBroaderSum = 0;
        int maxRightBroaderSum = 0;
        int center = (right - left) / 2;
        int maxLeftSum = getMaxSum(ints, left, center);
        int maxRightSum = getMaxSum(ints, center + 1, right);
        for (int i = center; i >= 0; i--) {
            leftBroaderSum += ints[i];
            if (leftBroaderSum > maxLeftBroaderSum) {
                maxLeftBroaderSum = leftBroaderSum;
            }
        }
        for (int i = center + 1; i <= right; i++) {
            rightBroaderSum += ints[i];
            if (rightBroaderSum > maxRightBroaderSum) {
                maxRightBroaderSum = rightBroaderSum;
            }
        }

        return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBroaderSum + maxRightBroaderSum);
    }
}
