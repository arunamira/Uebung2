package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 33, j = 2, k = -39, min = 10, max = 20;

		if (i < j) {
			if (i < k) {
				min = i;
			}
		}
		if (j < i) {
			if (j < k) {
				min = j;
			}
		}
		if (k < i) {
			if (k < j) {
				min = k;
			}
		}
		if (i > k) {
			if (i > k) {
				max = i;
			}
		}
		if (j > i) {
			if (j > k) {
				max = j;
			}
		}
		if (k > i) {
			if (k > j) {
				max = k;
			}
		}
		System.out.println("Das Minimum ist " + min);
		System.out.println("Das Maximum ist " + max);
	}

}
