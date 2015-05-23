//#include <stdio.h>
//#include <stdlib.h>
//
//void exchange(int *a, int i, int j) {
//	int temp = a[i];
//	a[i] = a[j];
//	a[j] = temp;
//}
//
//int partition(int *a, int lo, int hi) {
//	int i = lo , j = hi +1;
//
//	while (1) {
//		while (a[++i] < a[lo]) {
//
//			if (i == hi)
//				break;
//		}
//
//		while (a[lo] < a[--j]) {
//
//			if (hi == lo)
//				break;
//		}
//
//		if (i >= j)
//			break;
//
//		exchange(a, i, j);
//
//	}
//	exchange(a, lo, j);
//	return j;
//
//}
//
//void sort(int *a, int lo, int hi) {
//
//	if (lo >= hi)
//		return;
//	int j = partition(a, lo, hi);
//	sort(a, lo, j - 1);
//	sort(a, j + 1, hi);
//}
//
//void quickSort(int *a) {
//	sort(a, 0, 15);
//}
//
//int main(int argc, char **argv) {
//
//	int a[] = { 45, 12, 65, 19, 18, 12, 34, 67, 15, 68, 15, 17, 16, 98, 57, 45 };
//
//	int i;
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//
//	quickSort(a);
//	printf("\n");
//
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//	return 0;
//}
