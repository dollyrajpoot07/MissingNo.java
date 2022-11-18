// Given an array arr[] of size N-1 with integers in the range of [1, N], 
// the task is to find the missing number from the first N integers.

// Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
// Output: 5
// Explanation: The missing number between 1 to 8 is 5

// Input: arr[] = {1, 2, 3, 5}, N = 5
// Output: 4
// Explanation: The missing number between 1 to 5 is 4

// Java code to implement the approach

class MissingNo {
    public static void findMissing(int arr[], int size) {
        int i;

        for (i = 0; i < size; i++) {
            if (Math.abs(arr[i]) - 1 == size) {
                continue;
            }
            int ind = Math.abs(arr[i]) - 1;
            arr[ind] *= -1;
        }

        int ans = size + 1;
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;

        findMissing(arr, n);
    }
}
