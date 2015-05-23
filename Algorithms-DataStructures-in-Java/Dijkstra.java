//Program to implement Dijkstra's Algorithm

public class Dijkstra {

	DirectedEdge edgeTo[];
	double distTo[];
	IndexMinPQ<Double> pq;

	public Dijkstra(EdgeWeightedDigraph G, int s) {
		edgeTo = new DirectedEdge[G.V()];
		distTo = new double[G.V()];
		pq = new IndexMinPQ<>(G.V());

		for (int i = 0; i < G.V(); i++) {
			distTo[i] = 300;
		}

		distTo[s] = 0;
		pq.insert(0, 00.00);

		while (!pq.isEmpty()) {
			int v = pq.delMin();
			for (DirectedEdge e : G.adj(v)) {
				relax(e);
			}

		}

		for (int i = 0; i < G.V(); i++) {
			System.out.println(distTo[i]);
		}

	}

	public void relax(DirectedEdge e) {

		int v = e.from();
		int w = e.to();

		if (distTo[w] > distTo[v] + e.weight) {
			distTo[w] = distTo[v] + e.weight;
			edgeTo[w] = e;

			if (pq.contains(w))
				pq.decreaseKey(w, distTo[w]);
			else
				pq.insert(w, distTo[w]);
		}

	}

	public static void main(String[] args) {
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(5);
		g.addEdge(new DirectedEdge(0, 1, 4));
		g.addEdge(new DirectedEdge(1, 2, 2));
		g.addEdge(new DirectedEdge(2, 3, 2));
		g.addEdge(new DirectedEdge(1, 4, 2));
		g.addEdge(new DirectedEdge(0, 4, 5));
		g.addEdge(new DirectedEdge(4, 3, 9));

		Dijkstra d = new Dijkstra(g, 0);
	}
}
