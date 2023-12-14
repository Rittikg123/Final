package Package1;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void test() {
    	SelectionSort selectionSort = new SelectionSort();
    	
    	// Test case 1: Positive integers
        int[] array1 = {4, 2, 7, 1, 9, 5};
        int[] result1 = {1, 2, 4, 5, 7, 9};
        selectionSort.selectionSort(array1);
        Assert.assertArrayEquals(result1, array1);


        // Test case 2: Negative
        int[] array2 = {-4, -5, -10, -2, -3};
        int[] result2 = {-10, -5, -4, -3, -2};
        selectionSort.selectionSort(array2);
        Assert.assertArrayEquals(result2, array2);

        // Test case 3: Mixed
        int[] array3 = {-3, 2, 4, -6, 10};
        int[] result3 = {-6, -3, 2, 4, 10};
        selectionSort.selectionSort(array3);
        Assert.assertArrayEquals(result3, array3);
    }
}