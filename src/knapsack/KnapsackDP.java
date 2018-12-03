package knapsack;

public class KnapsackDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pt[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int c = 50;
		System.out.println(maxProfit(wt, pt, c));
	}

	public static int maxProfit(int[] wt, int[] p, int capacity) {
		int[][] wMatrix = new int[wt.length + 1][capacity + 1];

		for (int i = 0; i <= wt.length; i++) {
			for (int w = 0; w <= capacity; w++) {
				if (i == 0 || w == 0) {
					wMatrix[i][w] = 0;
				} else if (wt[i - 1] <= w) {
					wMatrix[i][w] = Math.max(wMatrix[i - 1][w], p[i - 1]
							+ wMatrix[i - 1][w - wt[i - 1]]);

				} else {
					wMatrix[i][w] = wMatrix[i - 1][w];
				}

			}
		}
		return wMatrix[wt.length][capacity];

	}

}
