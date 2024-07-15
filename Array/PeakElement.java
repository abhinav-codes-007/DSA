/**
 * PeakElement
 * 
 * GeeksForGeeks : https://www.geeksforgeeks.org/problems/peak-element/1
 * 
 * Description : Given an 0-indexed array of integers arr[] of size n, find its
 * peak element and return it's index. An element is considered to be peak if
 * it's value is greater than or equal to the values of its adjacent elements
 * (if they exist).
 * 
 * Note: The output will be 1 if the index returned by your function is correct;
 * otherwise, it will be 0.
 */
public class PeakElement {

    public static void main(String[] args) {
        int[] arr = { 23, 25, 15, 7 };
        System.out.println("Index of first Peak element : " + peakElement(arr, arr.length));
    }

    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public static int peakElement(int[] arr, int n) {
        // add code here.
        for (int index = 0; index < n; index++) {
            if (arr.length == 1) {
                return 0;
            }
            if (index == 0) {
                if (arr[index] >= arr[index + 1]) {
                    return index;
                } else {
                    continue;
                }
            } else if (index == n - 1) {
                if (arr[index] >= arr[index - 1]) {
                    return index;
                } else {
                    continue;
                }
            } else {
                if (arr[index] >= arr[index + 1] && arr[index] >= arr[index - 1]) {
                    return index;
                } else {
                    continue;
                }
            }
        }

        System.out.println("This will not be printed");
        return 10;
    }

}