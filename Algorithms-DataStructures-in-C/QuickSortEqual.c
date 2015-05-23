//#include <stdio.h>
//
//void exch(int *a, int i, int j) {
//	int temp = a[i];
//	a[i] = a[j];
//	a[j] = temp;
//}
//
//void quickSort(int *a, int lo, int hi) {
//
//	if (hi <= lo)
//		return;
//
//	int lt = lo, i = lo, gt = hi;
//	int v = a[lo];
//	while (i <= gt) {
//
//		if (a[i] < v) {
//			exch(a, lt++, i++);
//		} else if (a[i] > v) {
//			exch(a, gt--, i);
//		} else {
//			i++;
//		}
//	}
//	quickSort(a, lo, lt - 1);
//	quickSort(a, gt + 1, hi);
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
//	quickSort(a, 0, 15);
//	printf("\n");
//
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//	return 0;
//}
