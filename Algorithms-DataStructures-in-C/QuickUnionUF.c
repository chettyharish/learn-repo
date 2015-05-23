//#include <stdio.h>
//
//typedef int boolean;
//#define true 1
//#define false 0
//
//int id[10];
//
//void initialize() {
//	int i = 0;
//	for (i = 0; i < 10; ++i) {
//		id[i] = i;
//	}
//}
//
//int root(int i) {
//	while (i != id[i])
//		i = id[i];
//	return i;
//}
//
//boolean connected(int p, int q) {
//	return root(p) == root(q);
//}
//
//void unionf(int p, int q) {
//
//	int pid = root(p);
//	int qid = root(q);
//	id[pid] = qid;
//}
//
//int main(int argc, char **argv) {
//	initialize();
//	unionf(0, 1);
//	unionf(5, 6);
//	unionf(2, 7);
//	unionf(2, 3);
//	unionf(3, 4);
//	unionf(8, 9);
//
//	printf("%d\n", connected(7, 5));
//	printf("%d", connected(7, 4));
//	return (0);
//}
//
