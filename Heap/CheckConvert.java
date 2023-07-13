package com.anurag.Heap;

//Convert a Max-Heap to a Min-Heap

public class CheckConvert {


	  public static void convertMax(int[] maxHeap) {
	    int heaplength=maxHeap.length;
	    for (int i = (heaplength - 1) / 2; i >= 0; i--) {
				minHeapify(maxHeap, i, heaplength);
			}
	  }

	  private static void minHeapify(int[] heapArray, int index, int heapSize) {
			int smallest = index;

			while (smallest < heapSize / 2) { // check parent nodes only
				int left = (2 * index) + 1; //left child
				int right = (2 * index) + 2; //right child
				if (left < heapSize && heapArray[left] < heapArray[index]) {
					smallest = left;
				}

				if (right < heapSize && heapArray[right] < heapArray[smallest]) {
					smallest = right;
				}

				if (smallest != index) { // swap parent with smallest child
					int temp = heapArray[index];
					heapArray[index] = heapArray[smallest];
					heapArray[smallest] = temp;
					index = smallest;
				} else {
					break; // if heap property is satisfied
				}

			} //end of while
		}
	
}
