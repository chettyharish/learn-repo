//#include <stdlib.h>
//#include <math.h>
//#include <stdio.h>
//
//int a[16];
//int aux[16];
//
//void merge(int *a, int *aux, int lo, int mid, int hi) {
//
//	int i, j, k;
//
//	for (i = lo; i <= hi; ++i) {
//		aux[i] = a[i];
//	}
//
//	for (k = lo; k <= hi; ++k) {
//
//		if (i > mid)
//			a[k] = aux[j++];
//		if (j > hi)
//			a[k] = aux[i++];
//		if (aux[i] <= aux[j])
//			a[k] = aux[i++];
//		else
//			a[k] = aux[j++];
//	}
//}
//
//void mergeSort(int *a) {
//	int size=1, lo=0;
//
//	for (size = 1; size < 16; size = size * 2) {
//		for (lo = 0; lo <= 16 - size; lo = lo + size) {
//			if ((lo + size + size - 1) < 15)
//				merge(a, aux, lo, lo + size - 1, lo + size + size - 1);
//			else
//				merge(a, aux, lo, lo + size - 1, 15);
//
//		}
//
//	}
//
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
//	mergeSort(a);
//	printf("\n");
//
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//	return 0;
//
//}
