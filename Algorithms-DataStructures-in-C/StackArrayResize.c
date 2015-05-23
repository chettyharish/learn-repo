//#include <stdio.h>
//#include <stdlib.h>
//int *id;
//int N = 0;
//int count = 0;
//int size = 1;
//
//void resize(int newsize) {
//	int *temp = malloc(newsize);
//	int var;
//	for (var = 0; var < N; ++var) {
//		*(temp + var) = *(id + var);
//	}
//	id = temp;
//	size = newsize;
//	printf("New Size is %d", size);
//
//}
//
//void push(int x) {
//	if (count == size)
//		resize(2 * size);
//	*(id + N++) = x;
//	count++;
//
//}
//
//int pop() {
//
//	if (count <= size / 4)
//		resize(size / 2);
//
//	count--;
//	return *(id + --N);
//}
//
//int main(int argc, char **argv) {
//	id = malloc(2);
//	push(10);
//	push(20);
//	push(30);
//	push(40);
//	printf("\n%d", pop());
//	printf("\n%d", pop());
//	printf("\n%d", pop());
//	printf("\n%d", pop());
//
//	return 0;
//
//}
//
