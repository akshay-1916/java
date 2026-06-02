public class  IntermediatArray{

    // Method to rotate the array
    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];

        // Copy the last k elements to the beginning
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        // Copy the rest to the remaining part
        for (int i = k, j = 0; i < nums.length; i++, j++) {
            result[i] = nums[j];
        }

        // Copy back to the original array
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    // Main method to test the rotate method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Before rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotate(arr, k);

        System.out.println("\nAfter rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
