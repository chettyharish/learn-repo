//Program to implement Flow of an Edge

public class FlowEdge {

	int v, w;
	double capacity, flow;

	public FlowEdge(int v, int w, double capacity) {
		this.v = v;
		this.w = w;
		this.capacity = capacity;
	}

	public int from() {
		return v;
	}

	public int to() {
		return w;
	}

	public double capacity() {
		return capacity;
	}

	public double flow() {
		return flow;
	}

	public int other(int x) {
		if (x == v)
			return w;
		else
			return v;
	}

	public double residualCapacity(int x) {

		if (x == v)
			return flow;
		else
			return capacity - flow;

	}

	public void addResidualFlowTo(int x, double delta) {
		if (x == v)
			flow = flow - delta;
		else
			flow = flow + delta;
	}
}
