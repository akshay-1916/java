package sort;
class insertion {
    
    // Function to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Added a space between elements
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 4, 42, 7, 34, 2};

        // Insertion sorting
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;

            // Shift elements to the right to make space for 'curr'
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place 'curr' at the correct position
            arr[j + 1] = curr;
        }

        // Print the sorted array
        printArray(arr);
    }
}
