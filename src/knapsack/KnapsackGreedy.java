package knapsack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KnapsackGreedy {

	public static void main(String[] args) {
		List<Item> list = Arrays.asList(new Item(2, 10), new Item(1, 3),
				new Item(2, 5), new Item(4, 15), new Item(3, 18));

		System.out.println(maxProfit(list, 7));

	}

	public static double maxProfit(List<Item> items, int capacity) {
		double maxProfit = 0.0;
		Collections.sort(items,
				(a, b) -> b.profitByUnit.compareTo(a.profitByUnit));

		for (Item item : items) {

			if (capacity - item.weight > 0) {
				maxProfit += item.profit;
				capacity -= item.weight;
			} else {
				maxProfit += capacity * item.profitByUnit;
				break;
			}
		}

		return maxProfit;
	}

	static class Item {
		double weight;
		double profit;
		Double profitByUnit;

		public Item(double weight, double profit) {
			super();
			this.weight = weight;
			this.profit = profit;
			this.profitByUnit = (double) (profit / weight);
		}

	}

}
