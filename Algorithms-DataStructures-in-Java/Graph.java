//Program to implement Non-Directional Graph

import java.util.LinkedList;

public class Graph {

	private final int V;
	private Bag<Integer> adj[];
	private boolean marked[];
	private int edgeTo[];

	public Graph(int V) {
		this.V = V;
		adj = (Bag<Integer>[]) new Bag[V];
		marked = new boolean[V];
		edgeTo = new int[V];

		for (int i = 0; i < V; i++) {
			adj[i] = new Bag<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public void dfs(Graph G, int v) {
		marked[v] = true;

		for (int w : G.adj(v)) {
			if (!marked[w]) {
				System.out.print(w + "  ");
				dfs(G, w);
				edgeTo[w] = v;
			}
		}
	}

	public boolean hasPath(int v) {
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v) {
		if (!hasPath(v))
			return null;
		StackGeneric<Integer> stack = new StackGeneric<>();

		for (int i = v; i != 0; i = edgeTo[i]) {
			stack.push(i);
		}
		stack.push(0);
		return stack;

	}

	public void bfs(Graph g, int s) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		marked[s] = true;
		ll.addLast(s);

		while (!ll.isEmpty()) {
			int v = ll.pop();
			System.out.print(v + "  ");
			for (Integer w : g.adj(v)) {
				if (!marked[w]) {
					marked[w] = true;
					ll.addLast(w);
					edgeTo[w] = v;
					
				}

			}
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(6);
		g.addEdge(0, 4);
		g.addEdge(0, 1);
		g.addEdge(4, 2);
		g.addEdge(1, 3);
		g.bfs(g, 0);
		g.hasPath(4);

		for (int w : g.pathTo(2)) {
			System.out.print(w + "  ");

		}
	}
}
