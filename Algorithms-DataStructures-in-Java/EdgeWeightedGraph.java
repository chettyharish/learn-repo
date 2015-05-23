//Program to implement Edge Weighted Non-Directional Graph

public class EdgeWeightedGraph {

	public final int V;
	public Bag<Edge> adj[];
	public Bag<Edge> all;

	public EdgeWeightedGraph(int V) {
		this.V = V;
		adj = (Bag<Edge>[]) new Bag[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new Bag<Edge>();
		}
	}

	public void addEdge(Edge e) {
		int v = e.either();
		int w = e.other(v);
		adj[v].add(e);
		adj[w].add(e);
	}

	public Iterable<Edge> adj(int v) {
		return adj[v];
	}

	public Iterable<Edge> edges() {
		Bag<Edge> list = new Bag<Edge>();
		for (int v = 0; v < V; v++) {
			int selfLoops = 0;
			for (Edge e : adj(v)) {
				if (e.other(v) > v) {
					list.add(e);
				}
				// only add one copy of each self loop (self loops will be
				// consecutive)
				else if (e.other(v) == v) {
					if (selfLoops % 2 == 0)
						list.add(e);
					selfLoops++;
				}
			}
		}
		return list;
	}

}
