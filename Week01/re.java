 class Soulation {
        public void rotateArray(int[] nums, int k) {

            k = k % nums.length;
            if (k == 0 || nums.length < 2) {
                return;
            }
            int divideIndex = nums.length - k;

            int[] part1 = Arrays.copyOfRange(nums, divideIndex, nums.length);
            int[] part2 = Arrays.copyOfRange(nums, 0, divideIndex);

            System.arraycopy(part1, 0, nums, 0, k);
            System.arraycopy(part2, 0, nums, k, divideIndex);
        }
    }