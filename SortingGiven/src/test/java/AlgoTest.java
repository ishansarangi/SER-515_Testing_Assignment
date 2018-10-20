package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	private SortAlgos sortAlgos;

	@Before
	public void setUp() throws Exception {
		sortAlgos = new SortAlgos();
	}

	@After
	public void tearDown() throws Exception {
		sortAlgos = null;
		assertNull(sortAlgos);

	}

	// Task 2.2
	// Bubble Sort empty items EDGE, CONDITION case
	@Test(expected = java.lang.NullPointerException.class)
	public void testBubbleSortEmptyItems() {
		Item[] emptyItems = null;
		SortAlgos.bubbleSort(emptyItems);
	}

	// Bubble Sort NODE, EDGE, CONDITION common case
	@Test
	public void testBubbleSort() {
		int[] arr = { 1, 6, 4, 5, 3, 2 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 1, 2, 3, 4, 5, 6 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.bubbleSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Bubble Sort for node, edge and condition coverage", items[i].key, sorted[i].key);
	}

	// Bubble Sort CONDITION 1 element case
	@Test
	public void testBubbleSortOneElement() {
		Item[] items = { new Item(1) };
		Item[] sortedItems = { new Item(1) };

		SortAlgos.bubbleSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Bubble Sort for condition coverage of 1 element", items[i].key, sortedItems[i].key);
	}

	// Selection Sort empty items EDGE, CONDITION case
	@Test(expected = java.lang.NullPointerException.class)
	public void testSelectionSortEmptyItems() {
		Item[] emptyItems = null;
		SortAlgos.selectionSort(emptyItems);
	}

	// Selection Sort NODE, EDGE, CONDITION common case
	@Test
	public void testSelectionSort() {
		int[] arr = { 1, 6, 4, 5, 3, 2 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 1, 2, 3, 4, 5, 6 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.selectionSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Selection Sort for node, edge and condition coverage", items[i].key, sorted[i].key);
	}

	@Test
	public void testSelectionSortReverse() {
		int[] arr = { 50, 24, 20, 16, 6, 0 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 0, 6, 16, 20, 24, 50 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.selectionSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Selection Sort for node, edge and condition coverage for reverse sorted",
					items[i].key, sorted[i].key);
	}

	// Selection Sort CONDITION 1 element case
	@Test
	public void testSelectionSortOneElement() {
		Item[] items = { new Item(1) };
		Item[] sortedItems = { new Item(1) };

		SortAlgos.selectionSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Selection Sort for condition coverage of 1 element", items[i].key,
					sortedItems[i].key);
	}

	// Insertion Sort empty items EDGE, CONDITION case
	@Test(expected = java.lang.NullPointerException.class)
	public void testInsertionSortEmptyItems() {
		Item[] emptyItems = null;
		SortAlgos.insertionSort(emptyItems);
	}

	// Insertion Sort NODE, EDGE, CONDITION common case
	@Test
	public void testInsertionSort() {
		int[] arr = { 1, 6, 4, 5, 3, 2 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 1, 2, 3, 4, 5, 6 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.insertionSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Insertion Sort for node, edge and condition coverage", items[i].key, sorted[i].key);
	}

	@Test
	public void testInsertionSortReverse() {
		int[] arr = { 50, 24, 20, 16, 6, 0 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 0, 6, 16, 20, 24, 50 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.insertionSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Insertion Sort for node, edge and condition coverage for reverse sorted",
					items[i].key, sorted[i].key);
	}

	// Insertion Sort CONDITION 1 element case
	@Test
	public void testInsertionSortOneElement() {
		Item[] items = { new Item(1) };
		Item[] sortedItems = { new Item(1) };

		SortAlgos.insertionSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Insertion Sort for condition coverage of 1 element", items[i].key,
					sortedItems[i].key);
	}

	// Merge Sort empty items EDGE, CONDITION case
	@Test(expected = java.lang.NullPointerException.class)
	public void testMergeSortEmptyItems() {
		Item[] emptyItems = null;
		SortAlgos.mergeSort(emptyItems);
	}

	// Merge Sort NODE, EDGE, CONDITION common case
	@Test
	public void testMergeSort() {
		int[] arr = { 1, 6, 4, 5, 3, 2 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 1, 2, 3, 4, 5, 6 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.mergeSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Merge Sort for node, edge and condition coverage", items[i].key, sorted[i].key);
	}

	@Test
	public void testMergeSortReverse() {
		int[] arr = { 50, 24, 20, 16, 6, 0 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 0, 6, 16, 20, 24, 50 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.mergeSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Merge Sort for node, edge and condition coverage for reverse sorted", items[i].key,
					sorted[i].key);
	}

	// Merge Sort CONDITION 1 element case
	@Test
	public void testMergeSortOneElement() {
		Item[] items = { new Item(1) };
		Item[] sortedItems = { new Item(1) };

		SortAlgos.mergeSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Merge Sort for condition coverage of 1 element", items[i].key, sortedItems[i].key);
	}

	// Quick Sort empty items EDGE, CONDITION case
	@Test(expected = java.lang.NullPointerException.class)
	public void testQuickSortEmptyItems() {
		Item[] emptyItems = null;
		SortAlgos.quickSort(emptyItems);
	}

	// Quick Sort NODE, EDGE, CONDITION common case
	@Test
	public void testQuickSort() {
		int[] arr = { 16, 6, 24, 0, 50, 20 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 0, 6, 16, 20, 24, 50 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.quickSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Quick Sort for node, edge and condition coverage", items[i].key, sorted[i].key);
	}

	@Test
	public void testQuickSortReverse() {
		int[] arr = { 50, 24, 20, 16, 6, 0 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 0, 6, 16, 20, 24, 50 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.quickSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Quick Sort for node, edge and condition coverage for reverse sorted", items[i].key,
					sorted[i].key);
	}

	// Quick Sort CONDITION 1 element case
	@Test
	public void testQuickSortOneElement() {
		Item[] items = { new Item(1) };
		Item[] sortedItems = { new Item(1) };

		SortAlgos.quickSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Quick Sort for condition coverage of 1 element", items[i].key, sortedItems[i].key);
	}

	// Quick Sort CONDITION 2 element case
	@Test
	public void testQuickSortTwoElement() {
		Item[] items = { new Item(6), new Item(2) };
		Item[] sortedItems = { new Item(2), new Item(6) };

		SortAlgos.quickSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Quick Sort for condition coverage of 2 element", items[i].key, sortedItems[i].key);
	}

	// Heap Sort empty items EDGE, CONDITION case
	@Test(expected = java.lang.NullPointerException.class)
	public void testHeapSortEmptyItems() {
		Item[] emptyItems = null;
		SortAlgos.heapSort(emptyItems);
	}

	// Heap Sort NODE, EDGE, CONDITION common case
	@Test
	public void testHeapSort() {
		int[] arr = { 1, 6, 4, 5, 3, 2 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 1, 2, 3, 4, 5, 6 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.heapSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Heap Sort for node, edge and condition coverage", items[i].key, sorted[i].key);
	}

	// Heap Sort CONDITION 1 element case
	@Test
	public void testHeapSortOneElement() {
		Item[] items = { new Item(1) };
		Item[] sortedItems = { new Item(1) };

		SortAlgos.heapSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Heap Sort for condition coverage of 1 element", items[i].key, sortedItems[i].key);
	}

	@Test
	public void testHeapSortReverse() {
		int[] arr = { 50, 24, 20, 16, 6, 0 };
		Item[] items = new Item[6];
		for (int i = 0; i < arr.length; i++)
			items[i] = new Item(arr[i]);

		int[] sortedList = { 0, 6, 16, 20, 24, 50 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedList.length; i++)
			sorted[i] = new Item(sortedList[i]);

		SortAlgos.heapSort(items);
		for (int i = 0; i < items.length; i++)
			assertEquals("Testing Heap Sort for node, edge and condition coverage for reverse sorted", items[i].key,
					sorted[i].key);
	}
}
