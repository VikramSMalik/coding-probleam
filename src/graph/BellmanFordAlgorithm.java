package graph;

public class BellmanFordAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] g = { { 0, 2, 0, 1 }, { 0, 0, 4, 3 }, { 0, 0, 0, 0 },{ 0, 0,
		// 8, 0 } };
		int[][] g = { { 0, 6, 5, 5, 0, 0, 0 }, { 0, 0, 0, 0, -1, 0, 0 },
				{ 0, -2, 0, 0, 1, 0, 0 }, { 0, 0, -2, 0, 0, -1, 0 },
				{ 0, 0, 0, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0, 3 },
				{ 0, 0, 0, 0, 0, 0, 0 } };
		bellmanFord(g, 0, 7);
	}

	public static void bellmanFord(int[][] g, int s, int v) {
		int[] dist = new int[v];
		for (int i = 0; i < v; i++) {
			dist[i] = Integer.MAX_VALUE;

		}
		dist[s] = 0;
		for (int c = 0; c < v - 1; c++) {
			for (int u = 0; u < v; u++) {
				for (int i = 0; i < v; i++) {
					if (g[u][i] != 0 && (dist[u] + g[u][i]) < dist[i]) {
						dist[i] = dist[u] + g[u][i];
					}
				}
			}

		}
		for (Integer e : dist) {
			System.out.println(e);
		}

	}

}
