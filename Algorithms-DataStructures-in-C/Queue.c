//#include <stdio.h>
//#include <stdlib.h>
//
//struct node {
//	int data;
//	struct node *next;
//};
//
//struct node *first = 0;
//struct node *last = 0;
//
//void enqueue(int x) {
//	struct node *newnode = malloc(sizeof(struct node));
//	newnode->data = x;
//	if (first == 0) {
//		first = last = newnode;
//	} else {
//		last->next = newnode;
//		last = newnode;
//	}
//}
//
//int dequeue() {
//	int temp = first->data;
//	first = first->next;
//	return temp;
//}
//
//int main(int argc, char **argv) {
//	enqueue(10);
//	enqueue(20);
//	enqueue(30);
//	enqueue(40);
//	enqueue(50);
//	printf("%d\t", dequeue());
//	enqueue(30);
//	printf("%d\t", dequeue());
//	printf("%d\t", dequeue());
//	printf("%d\t", dequeue());
//	printf("%d\t", dequeue());
//	printf("%d\t", dequeue());
//	return 0;
//}
//
