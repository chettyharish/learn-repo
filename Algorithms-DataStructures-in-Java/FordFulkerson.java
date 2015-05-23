//Program to implement Ford Fulkerson Algorithm

public class FordFulkerson {

	boolean marked[];
	FlowEdge edgeTo[];
	double value;

	public FordFulkerson(FlowNetwork G, int s, int t) {
		value = 0;

		while (hasAugmentingPath(G, s, t)) {
			double bottle = Double.POSITIVE_INFINITY;

			for (int v = t; v != s; v = edgeTo[v].other(v))
				bottle = Math.min(bottle, edgeTo[v].residualCapacity(v));

			for (int v = t; v != s; v = edgeTo[v].other(v))
				edgeTo[v].addResidualFlowTo(v, bottle);

			value = value + bottle;
		}

	}

	public boolean hasAugmentingPath(FlowNetwork G, int s, int t) {
		marked = new boolean[G.V];
		edgeTo = new FlowEdge[G.V];

		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(s);
		marked[s] = true;

		while (!q.isEmpty()) {

			int v = q.dequeue();

			for (FlowEdge e : G.adj(v)) {
				int w = e.other(v);
				if (e.residualCapacity(v) > 0 && !marked[w]) {
					edgeTo[w] = e;
					marked[w] = true;
					q.enqueue(w);

				}
			}

		}

		return marked[t];
	}

	public double value() {
		return value;
	}

	public boolean inCut(int v) {
		return marked[v];
	}

}
