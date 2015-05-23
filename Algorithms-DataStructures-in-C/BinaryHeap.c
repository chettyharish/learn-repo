//#include <stdio.h>
//
//typedef int boolean;
//#define false 0
//#define true 1
//
//int pq[16];
//int N = 0;
//
//boolean less(int i, int j) {
//	return pq[i] < pq[j];
//}
//
//void exchange(int i, int j) {
//	int temp = pq[i];
//	pq[i] = pq[j];
//	pq[j] = temp;
//}
//
//void swim(int k) {
//	while (k > 1 && less(k/2,k)) {
//		exchange(k, k / 2);
//		k = k / 2;
//	}
//}
//
//void sink(int k) {
//
//	while (2 * k <= N) {
//		int j = 2 * k;
//		if (j < N && less(j, j + 1))
//			j = j + 1;
//
//		if (less(k, j)) {
//			exchange(k, j);
//			k = j;
//		} else
//			break;
//	}
//}
//
//void insert(int x) {
//	pq[++N] = x;
//	swim(N);
//}
//
//int deletemax() {
//	int max = pq[1];
//	exchange(1, N--);
//	sink(1);
//	return max;
//}
//
//int main(int argc, char **argv) {
//
//	insert(25);
//	insert(10);
//	insert(5);
//	insert(15);
//	insert(30);
//	insert(20);
//
//	printf("%d\n", deletemax());
//	printf("%d\n", deletemax());
//	printf("%d\n", deletemax());
//	printf("%d\n", deletemax());
//	printf("%d\n", deletemax());
//	printf("%d\n", deletemax());
//	return 0;
//}
