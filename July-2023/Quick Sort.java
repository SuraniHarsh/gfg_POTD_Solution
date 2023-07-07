
class Solution {
    // Function to sort an array using quick sort algorithm.
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int part = low;

        for (int j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                swap(arr, part, j);
                ++part;
            }
        }

        swap(arr, part, high);
        return part;
    }

    private void swap(int[] arr, int i, int j) {
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }
}