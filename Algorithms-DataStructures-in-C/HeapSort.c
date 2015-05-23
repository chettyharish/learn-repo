//#include <stdio.h>
//
//typedef int boolean;
//#define true 1
//#define false 0
//
//int N;
//
//boolean less(int *a, int i, int j) {
//	return a[i - 1] < a[j - 1];
//}
//
//void exchange(int *a, int i, int j) {
//	int temp = a[i - 1];
//	a[i - 1] = a[j - 1];
//	a[j - 1] = temp;
//}
//
//void sink(int *a, int k, int N) {
//
//	while (2 * k <= N) {
//		int j = 2 * k;
//		if (j < N && less(a, j, j + 1))
//			j = j + 1;
//		if (less(a, k, j)) {
//			exchange(a, j, k);
//			k = j;
//		} else
//			break;
//	}
//}
//
//void quickSort(int *a) {
//	N = 16;
//	int k;
//	for (k = N / 2; k >= 1; k--) {
//		sink(a, k, N);
//	}
//
//	while (N >= 1) {
//		exchange(a, 1, N--);
//		sink(a, 1, N);
//	}
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
