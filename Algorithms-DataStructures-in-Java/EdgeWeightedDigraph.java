//Program to implement Edge Weighter Directed Graph

public class EdgeWeightedDigraph {
	private final int V;
	private final Bag<DirectedEdge>[] adj;
	private double distTo[];
	private DirectedEdge edgeTo[];

	public EdgeWeightedDigraph(int V) {
		this.V = V;
		adj = (Bag<DirectedEdge>[]) new Bag[V];
		distTo = new double[V];
		edgeTo = new DirectedEdge[V];
		for (int i = 0; i < V; i++)
			adj[i] = new Bag<DirectedEdge>();
	}

	public void addEdge(DirectedEdge e) {
		int v = e.from();
		adj[v].add(e);
	}

	public Iterable<DirectedEdge> adj(int v) {
		return adj[v];
	}

	public double distTo(int w) {
		return distTo[w];
	}

	public Iterable<DirectedEdge> partTo(int v) {
		StackGeneric<DirectedEdge> path = new StackGeneric<DirectedEdge>();

		for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
			path.push(e);
		}

		return path;
	}

	public int V() {
		return V;
	}
}
