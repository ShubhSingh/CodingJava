package main.java;

import java.util.Arrays;

/**
 * This program rotates all of the elements in an array left by a given d
 * value. It runs in O(n) time and uses O(1) additional space (it operates
 * in-place).
 */
public class BlockSwapAlgorithm {

	public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

        System.out.println(Arrays.toString(array));
        System.out.println("rotated to the left " + d + " is:");
        rotateArrayLeft(array, d);
        System.out.println(Arrays.toString(array)); // Output is: [3, 4, 5, 6, 7, 1, 2]
    }

    /**
     * Rotates all of the elements in an array left by the given d value.
     * If d is negative, it rotates the elements in the array right.
     * This method modifies the array in place, so it does not return
     * anything.
     *
     * @param array The array to shift.
     * @param d     The number of indices by which to shift the array.
     */
    public static void rotateArrayLeft(int[] array, int d) {
        if (array == null) {
            return;
        }

        int n = array.length;

        // Handle negative d values (rotate to right)
        if (d < 0) {
            d = n - Math.abs(d);
        }

        // Ensure d is in interval [0, n)
        d = ((d % n) + n) % n;

        rotateArrayLeft(array, 0, n - 1, d, n - d);
    }

    /**
     * Swaps two blocks of elements within a subarray. This method modifies
     * the subarray in place, so it does not return anything.
     *
     * @param array         The array containing the subarray we will shift.
     * @param startIndex    The starting index of the subarray.
     * @param endIndex      The ending index of the subarray.
     * @param leftSize      The size of the left block.
     * @param rightSize     The size of the right block.
     */
    public static void rotateArrayLeft(int[] array, int startIndex, int endIndex, int leftSize, int rightSize) {
        if (leftSize == rightSize) {
            swapBlocks(array, startIndex, startIndex + rightSize, rightSize);
        } else if (leftSize < rightSize) {
            swapBlocks(array, startIndex, endIndex - leftSize + 1, leftSize);
            rotateArrayLeft(array, startIndex, endIndex - leftSize, leftSize, rightSize - leftSize);
        } else {
            swapBlocks(array, startIndex, endIndex - rightSize + 1, rightSize);
            rotateArrayLeft(array, startIndex + rightSize, endIndex, leftSize - rightSize, rightSize);
        }
    }

    /**
     * Swaps two blocks of equal size in an array.
     *
     * @param array         The array.
     * @param leftIndex     The index of the first element in the left block.
     * @param rightIndex    The index of the first element in the right block.
     * @param blockSize     The size of each block.
     */
     private static void swapBlocks(int[] array, int leftIndex, int rightIndex, int blockSize) {
        for (int i = 0; i < blockSize; i++) {
            swap(array, leftIndex + i, rightIndex + i);
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param array     The array.
     * @param index1    The index of the first element to swap.
     * @param index2    The index of the second element to swap.
     */
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}