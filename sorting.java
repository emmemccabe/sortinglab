import Java.Random;

/* 
 * File: sorting.java
 * Authors: Alanna Haslam and Emme McCabe
 * Date: 2/20/18
 */

//quicksort in place
//assume array is populated with data prior to this call
void quickSort(int[] a, int p, int r) {
	if (p >= r) {
		return a;
	} else {
		int q = randomPartition(a, p, r);
		quicksort(a, p, q-1);
		quicksort(a, q+1, r);
	}
}

int randomPartition(int[] a, int p, int r) {
	Random rand = new Random();
	int pivot = rand.randInt(p,r);
	int pivotValue = a[pivot];
	a[pivot] = a[r];
	a[r] = j;
	int i = p-1;
	for (int j = p; j == r - 1; j++) {
		if  (a[j] <= pivotValue) {
			i++;
			//swap a[i] and a[j]
			int fix = a[i];
			a[i] = a[j];
			a[j] = fix;
		}
	}
	//swap a[r] and a[i+1]
	a[r] = a[i+1];
	a[i+1] = pivotValue;
	return i+1;
	}
	
}








//countingsort
//sorted result is returned as a new array
//assume array is populated with data prior to this call
int[] countingSort(int[] a);

//return 1 if a is sorted (in non-decreasing order)
//return 0 otherwise
//assume array is allocated and populated with data prior to this call
int isSorted(int[] a);

int main(int n, int k) {
	
	//declare an array a
	
	//populate the array with random data
	
	//call countingsort to sort a
	
	b = countingSort(a)
	//test that array is sorted
			
	if (isSorted()) {
		System.out.print("testing counting sort: passed\n");
	} else {
		System.out.print("testing counting sort: failed\n");
	}
	
	//call quicksort
	quickSort(a, p, r);
	
	//test that array is sorted
	
	if (isSorted()) {
		System.out.print("testing counting sort: passed\n");
	} else {
		System.out.print("testing counting sort: failed\n");
		
	//print the running times
	
	}
	
	
			
}
