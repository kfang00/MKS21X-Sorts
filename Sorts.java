public class Sorts {
    public static void selectionSort(int [] ary) { 
	int smallest = 0;
	int idx = 0;
	for (int a = 0; a < ary.length; a++) {
	    smallest = ary[a];
	    for (int b = a; b < ary.length; b++) {
		if (ary[b] <= ary[a]) {
		    smallest = ary[b];
		    idx = b;
		}
	    }
	    if (smallest != ary[a]) {
		ary[idx] = ary[a];
		ary[a] = smallest;
	    }
	}
    }
}
