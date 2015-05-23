//#include <stdio.h>
//#include <stdlib.h>
//
//struct node {
//	int data;
//	struct node *next;
//};
//
//struct node *first = 0;
//
//void push(int x) {
//	struct node *newnode = malloc(sizeof(struct node));
//	newnode->data = x;
//	newnode->next = first;
//	first = newnode;
//}
//
//int pop() {
//	int temp = first->data;
//	first = first->next;
//	return temp;
//}
//
//int main(int argc, char **argv) {
//
//	push(10);
//	push(20);
//	push(30);
//	push(40);
//	push(50);
//	printf("%d", pop());
//	push(30);
//	printf("%d", pop());
//	printf("%d", pop());
//	printf("%d", pop());
//	printf("%d", pop());
//
//	return 0;
//}
