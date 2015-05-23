//#include <stdio.h>
//
//void exchange(int *a, int i, int j) {
//	int temp = a[i];
//	a[i] = a[j];
//	a[j] = temp;
//}
//
//void selectionSort(int *a) {
//	int i, j;
//	for (i = 0; i < 16; i++) {
//		int min = i;
//		for (j = i; j < 16; j++) {
//			if (a[j] < a[min]) {
//				min = j;
//			}
//		}
//		exchange(a, i, min);
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
//	selectionSort(a);
//	printf("\n");
//
//	for (i = 0; i < 16; i++) {
//		printf("%d  ", a[i]);
//	}
//	return 0;
//}
