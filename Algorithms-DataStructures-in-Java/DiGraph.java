//Program to implement Directional Graph

public class DiGraph {

	private final int V;
	private Bag<Integer> adj[];
	private boolean marked[];
	private StackGeneric<Integer> stack;

	public DiGraph(int V) {
		this.V = V;

		adj = (Bag<Integer>[]) new Bag[V];
		marked = new boolean[V];
		stack = new StackGeneric<>();
		for (int i = 0; i < V; i++) {
			adj[i] = new Bag<>();
		}

	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public Iterable<Integer> adj(int v) {
		return adj[v];
	}

	public void dfs(DiGraph g, int v) {
		marked[v] = true;

		for (int w : g.adj(v))
			if (!marked[w])
				dfs(g, w);

		stack.push(v);
	}

	public boolean visited(int v) {
		return marked[v];
	}

	public void output() {
		for (int i = 0; i < V; i++) {
			for (int j : adj[i])
				System.out.print(j + "-- ");
			System.out.println();

		}
	}

	public Iterable<Integer> reversePost() {
		return stack;
	}

	public static void main(String[] args) {
		DiGraph dg = new DiGraph(7);

		dg.addEdge(0, 5);
		dg.addEdge(0, 2);
		dg.addEdge(0, 1);
		dg.addEdge(1, 4);
		dg.addEdge(3, 6);
		dg.addEdge(3, 5);
		dg.addEdge(3, 4);
		dg.addEdge(3, 2);
		dg.addEdge(5, 2);
		dg.addEdge(6, 4);
		dg.addEdge(6, 0);

		
		 dg.dfs(dg, 0);
		
		 for (int i : dg.reversePost()) {
		 System.out.print(i + " ");
		 }

	}

}
