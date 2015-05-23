//Program to implement Topological SP

public class TopoSP {
	private DirectedEdge[] edgeTo;
	private double distTo[];

	public TopoSP(EdgeWeightedDigraph g, int s) {
		edgeTo = new DirectedEdge[g.V()];
		distTo = new double[g.V()];

		for (int i = 0; i < g.V(); i++)
			distTo[i] = Double.POSITIVE_INFINITY;

		distTo[s] = 0;

		DiGraph dg = new DiGraph(g.V());
		dg.addEdge(0, 1);
		dg.addEdge(1, 2);
		dg.addEdge(2, 3);
		dg.addEdge(1, 4);
		dg.addEdge(0, 4);
		dg.addEdge(4, 3);
		dg.dfs(dg, 0);
		for (int v : dg.reversePost()) {
			for (DirectedEdge e : g.adj(v)) {
				relax(e);
			}
		}
		
		for (int i = 0; i < g.V(); i++) {
			System.out.println(distTo[i]);
		}

	}

	public void relax(DirectedEdge e) {

		int v = e.from();
		int w = e.to();

		if (distTo[w] > distTo[v] + e.weight) {
			distTo[w] = distTo[v] + e.weight;
			edgeTo[w] = e;

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

		TopoSP d = new TopoSP(g, 0);
	}
}
