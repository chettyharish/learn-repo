//#include <stdio.h>
//#include <stdlib.h>
//
//struct node {
//	int key;
//	int value;
//	int count;
//	struct node *left, *right;
//};
//
//struct node *root = NULL;
//
//int size(struct node *x) {
//	if (x == NULL)
//		return 0;
//	return x->count;
//}
//
//struct node* floor12(struct node* x, int key) {
//	if (x == NULL)
//		return NULL;
//
//	if (key == x->key)
//		return x;
//
//	if (key < x->key)
//		return floor12(x->left, key);
//
//	struct node *t = floor12(x->right, key);
//	if (t != NULL)
//		return t;
//	else
//		return x;
//}
//
//int floorMain(int key) {
//	struct node* t = floor12(root, key);
//	if (t == NULL)
//		return 0;
//	return t->key;
//}
//
//struct node* insert(struct node *x, int key, int value) {
//
//	if (x == NULL) {
//		struct node *newnode = malloc(sizeof(struct node));
//		newnode->key = key;
//		newnode->value = value;
//		newnode->left = NULL;
//		newnode->right = NULL;
//		newnode->count = 1;
//		return newnode;
//	}
//
//	if (key < x->key)
//		x->left = insert(x->left, key, value);
//	else if (key > x->key)
//		x->right = insert(x->right, key, value);
//	else if (key == x->key)
//		x->value = value;
//
//	x->count = 1 + size(x->left) + size(x->right);
//	return x;
//
//}
//
//void insertMain(int key, int value) {
//	root = insert(root, key, value);
//}
//
//void inorder(struct node *x) {
//
//	if (x == NULL)
//		return;
//
//	inorder(x->left);
//	printf("%d  ", x->key);
//	inorder(x->right);
//}
//
//void inorderMain() {
//	inorder(root);
//}
//
//struct node* min(struct node *x) {
//	while (x->left != NULL)
//		x = x->left;
//	return x;
//}
//
//struct node* deleteMin(struct node *x) {
//	if (x->left == NULL)
//		return x->right;
//	x->left = deleteMin(x->left);
//	return x;
//}
//
//struct node* delete(struct node *x, int key) {
//	if (x == NULL)
//		return NULL;
//
//	if (key < x->key)
//		x->left = delete(x->left, key);
//	else if (key > x->key)
//		x->right = delete(x->right, key);
//	else if (key == x->key) {
//		if (x->right == NULL)
//			return x->left;
//
//		struct node *t = x;
//		x = min(x->right);
//		x->right = deleteMin(t->right);
//		x->left = t->left;
//
//	}
//
//	return x;
//}
//
//void deleteMain(int key) {
//	root = delete(root, key);
//}
//
//int rankMain(int key) {
//	return rank(root, key);
//}
//
//int rank(struct node* x, int key) {
//	if (x == NULL)
//		return 0;
//
//	if (key < x->key)
//		return rank(x->left, key);
//	else if (key > x->key)
//		return 1 + size(x->left) + rank(x->right, key);
//	else if (key == x->key)
//		return size(x->left);
//}
//
//int main(int argc, char **argv) {
//	insertMain(19, 100);
//	insertMain(13, 100);
//	insertMain(10, 100);
//	insertMain(20, 100);
//	insertMain(5, 100);
//	insertMain(23, 100);
//	insertMain(28, 100);
//	insertMain(16, 100);
//	insertMain(27, 100);
//	insertMain(9, 100);
//	insertMain(4, 100);
//	insertMain(22, 100);
//	insertMain(17, 100);
//	insertMain(30, 100);
//	insertMain(40, 100);
//
//	printf("%d", rankMain(21));
//
//	return 0;
//
//}
