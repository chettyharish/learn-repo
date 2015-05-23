//Program to implement an Directed Edge for Graphs

public class DirectedEdge {
	int v, w;
	double weight;

	public DirectedEdge(int v, int w, double weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}

	public int from() {
		return v;
	}

	public int to() {
		return w;
	}

	public double weight() {
		return weight;
	}

}
