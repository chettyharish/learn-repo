//#include <stdlib.h>
//#include <stdio.h>
//
//void exchange(int *a, int i, int j) {
//	int temp = a[i];
//	a[i] = a[j];
//	a[j] = temp;
//}
//
//void shellSort(int *a) {
//	int i, j, h;
//	i = j = 0;
//	h = 1;
//
//	while (h < 16)
//		h = 3 * h + 1;
//
//	while (h >= 1) {
//
//		for (i = h; i < 16; i++) {
//			for (j = i; j >= h; j = j - h) {
//				if (a[j] < a[j - h])
//					exchange(a, j, j - h);
//			}
//		}
//
//		h = h / 3;
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
//	shellSort(a);
//	printf("\n");
//
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//	return 0;
//}
