package dcp;

/**
 * This problem was asked by Amazon.
 * 
 * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
 * 
 * @author vikram.singh
 *
 */
public class MatrixClockwiseSprial {
	public static void main(String[] args) {
		
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		clockwiseSprial(a, 4, 4);
	}

	public static void clockwiseSprial(int a[][], int r, int c) {
		int rt = 0;
		int rb = r;
		int cl = 0;
		int cr = c;

		while (rt < rb && cl < cr) {
			for (int i = cl; i < cr; i++) {
				System.out.println(a[rt][i]);
			}
			rt++;
			for (int i = rt; i < rb; i++) {
				System.out.println(a[i][cr - 1]);
			}
			cr--;

			for (int i = cr - 1; i >= cl; i--) {
				System.out.println(a[rb - 1][i]);
			}
			rb--;
			for (int i = rb-1; i > rt; i--) {
				System.out.println(a[i][cl]);
			}
			cl++;

		}

	}

}
