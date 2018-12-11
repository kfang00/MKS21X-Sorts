public class Sorts {
    public static void selectionSort(int [] ary) {
	int smallest = 0;
	int idx = 0;
	for (int a = 0; a < ary.length; a++) {
	    smallest = ary[a];
	    for (int b = a; b < ary.length; b++) {
		if (ary[b] < smallest) {
		    smallest = ary[b];
		    idx = b;
		}
	    }
	    if (smallest != ary[a]) {
		ary[idx] = ary[a];
		ary[a] = smallest;
	    }
	    //System.out.println(printArray(ary));
	}
    }

    public static void bubbleSort(int[] ary) {
        int countSwaps = 0;
	int hold = 0;
	boolean allGood = false;
	while (allGood == false) {
	    countSwaps = 0;
	    for (int a = 0; (a + 1) < ary.length; a++) {
	        if (ary[a] > ary[a + 1]) {
		    hold = ary[a]; 
		    ary[a] = ary[a + 1];
		    ary[a + 1] = hold;
		    countSwaps += 1;
		}
		//System.out.println(printArray(ary));
	    }
	    if (countSwaps == 0) {
		allGood = true;
	    }
	}
	
    }

    public static void insertionSort(int[] ary) {
	int hold = 0;
	for (int a = 1; a < ary.length; a++) {
	    hold = ary[a];
	    for (int b = (a - 1); b != 0; b--) {
	        if (hold > ary[b]) {
		    ary[b] = hold; 
		    hold = ary[a] - 1;
		}
		else {
		    ary[b] = ary[b + 1];
		}
		
	    }
	    if (hold != ary[a]) {
		ary[0] = ary[a];
	    }
	}
    }

public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
  }

  public static void main(String[] args) {

    // Google random int generator

    String selectionSorted = "";
    String bubbleSorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));
    // [3, 4, 7, 1, 6, 2, 8, 6]

    selectionSort(test_a);

    selectionSorted = printArray(test_a);
    System.out.println(selectionSorted);
    // [1, 2, 3, 4, 6, 6, 7, 8]

    if(selectionSorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));
    // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    selectionSort(test_b);

    selectionSorted = printArray(test_b);
    System.out.println(selectionSorted);
    // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(selectionSorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));
    // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    selectionSort(test_c);

    selectionSorted = printArray(test_c);
    System.out.println(selectionSorted);
    // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(selectionSorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }
    int[] test_now = { 7, 5, 4, 2};
    System.out.println(printArray(test_now));
    // [7, 5, 4, 2]

    selectionSort(test_now);

    selectionSorted = printArray(test_now);
    System.out.println(selectionSorted);
    // [2, 4, 5, 7]

    int[] test_now1 = {5, 1, 12, -5, 16, 2, 12, 14};
    System.out.println(printArray(test_now1));
    // [5, 1, 12, -5, 16, 2, 12, 14]

    selectionSort(test_now1);

    selectionSorted = printArray(test_now1);
    System.out.println(selectionSorted);
    // [-5, 1, 2, 5, 12, 12, 14, 16]

    int[] test_bub = {5, 1, 12, -5, 16};
    System.out.println(printArray(test_bub));
    // [5, 1, 12, -5, 16]

    bubbleSort(test_bub);

    bubbleSorted = printArray(test_bub);
    System.out.println(bubbleSorted);
    // [-5, 1, 5, 12, 16]

    int[] test_bub1 = {2, 3, 4, 5, 1};
    System.out.println(printArray(test_bub1));
    // [2, 3, 4, 5, 1]

    bubbleSort(test_bub1);

    bubbleSorted = printArray(test_bub1);
    System.out.println(bubbleSorted);
    // [1, 2, 3, 4, 5]

    int[] test_bub2 = {6, 1, 2, 3, 4, 5};
    System.out.println(printArray(test_bub2));
    // [6, 1, 2, 3, 4, 5]

    bubbleSort(test_bub2);

    bubbleSorted = printArray(test_bub2);
    System.out.println(bubbleSorted);
    // [1, 2, 3, 4, 5, 6]
  }

}
