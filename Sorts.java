public class Sorts {
    public static void selectionSorts(int [] ary) { 
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
	    System.out.println(ary);
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

    String selectionSortsed = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));
    // [3, 4, 7, 1, 6, 2, 8, 6]

    selectionSorts(test_a);

    selectionSortsed = printArray(test_a);
    System.out.println(selectionSortsed);
    // [1, 2, 3, 4, 6, 6, 7, 8]

    if(selectionSortsed.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));
    // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    selectionSorts(test_b);

    selectionSortsed = printArray(test_b);
    System.out.println(selectionSortsed);
    // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(selectionSortsed.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));
    // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    selectionSorts(test_c);

    selectionSortsed = printArray(test_c);
    System.out.println(selectionSortsed);
    // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(selectionSortsed.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }
    int[] test_now = { 7, 5, 4, 2};
    System.out.println(printArray(test_now));
    // [7, 5, 4, 2]

    selectionSorts(test_now);

    selectionSortsed = printArray(test_now);
    System.out.println(selectionSortsed);
    // [2, 4, 5, 7]

    int[] test_now1 = {5, 1, 12, -5, 16, 2, 12, 14};
    System.out.println(printArray(test_now1));
    // [5, 1, 12, -5, 16, 2, 12, 14]

    selectionSorts(test_now1);

    selectionSortsed = printArray(test_now1);
    System.out.println(selectionSortsed);
    // [-5, 1, 2, 5, 12, 12, 14, 16]

  }

}
