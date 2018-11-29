package graph;

public class DijkstraAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] g = { { 0, 2, 0, 1 }, { 0, 0, 4, 3 }, { 0, 0, 0, 0 },
				{ 0, 0, 8, 0 } };
		dijkstra(g, 0, 4);

	}

	public static void dijkstra(int[][] g, int s, int v) {
		int[] dist = new int[v];
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			dist[i] = Integer.MAX_VALUE;
			visited[i] = Boolean.FALSE;
		}
		dist[s] = 0;
		for (int c = 0; c < v - 1; c++) {
			int u = sortDist(dist, visited, v);
			visited[u] = true;
			for (int i = 0; i < v; i++) {
				if (g[u][i] != 0 && (dist[u] + g[u][i]) < dist[i]) {
					dist[i] = dist[u] + g[u][i];
				}
			}
		}

		for (Integer e : dist) {
			System.out.println(e);
		}

	}

	public static int sortDist(int[] dist, boolean[] visited, int v) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < v; i++) {
			if (!visited[i] && dist[i] != Integer.MAX_VALUE && dist[i] < min) {
				min = dist[i];
				index = i;
			}
		}
		return index;
	}

}
