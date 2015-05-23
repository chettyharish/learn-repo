#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct node {
	int data;
	struct node* next;
};

void add(struct node **bag, int data) {
	struct node *newnode = malloc(sizeof(struct node));
	newnode->data = data;
	newnode->next = *bag;
	*bag = newnode;
}

int V;
struct node *adj[7];
bool marked[7];
int edgeTo[7 * 6];

void initialize() {
	int i = 0;
	for (i = 0; i < 7; ++i) {
		adj[i] = malloc(sizeof(struct node));
		adj[i]->data = 0;
		adj[i]->next = NULL;
		marked[i] = false;
	}
}

void addEdge(int v, int w) {
	add(&adj[v], w);
	add(&adj[w], v);
}

void dfs(int v) {
	printf("%d  ", v);
	marked[v] = true;
	struct node *x = adj[v];
	while (x != NULL) {
		int w = x->data;
		if (marked[w] == false) {
			dfs(w);
		}
		x = x->next;
	}
}

int main(int argc, char **argv) {

	initialize();
	addEdge(0, 1);
	addEdge(0, 2);
	addEdge(0, 5);
	addEdge(1, 4);
	addEdge(3, 2);
	addEdge(3, 4);
	addEdge(3, 5);
	addEdge(3, 6);
	addEdge(5, 2);
	addEdge(6, 0);
	addEdge(6, 4);
	dfs(0);

	printf("done");
	return 0;
}
