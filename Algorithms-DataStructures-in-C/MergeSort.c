//#include <stdio.h>
//
//int aux[16];
//
//void merge(int *a, int *aux, int lo, int mid, int hi) {
//	int i, j, k;
//	for (i = lo; i <= hi; ++i) {
//		aux[i] = a[i];
//	}
//
//	i = lo, j = mid + 1;
//
//	for (k = lo; k <= hi; ++k) {
//		if (i > mid)
//			a[k] = aux[j++];
//		else if (j > hi)
//			a[k] = aux[i++];
//		else if (aux[i] < aux[j])
//			a[k] = aux[i++];
//		else
//			a[k] = aux[j++];
//
//	}
//
//}
//
//void mergeSort(int *a, int *aux, int lo, int hi) {
//
//	if (hi <= lo)
//		return;
//
//	int mid = lo + (hi - lo) / 2;
//
//	mergeSort(a, aux, lo, mid);
//	mergeSort(a, aux, mid + 1, hi);
//
//	merge(a, aux, lo, mid, hi);
//
//}
//
//void initializer(int *a) {
//	mergeSort(a, aux, 0, 15);
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
//	initializer(a);
//	printf("\n");
//
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//	return 0;
//}
