package h3;

public class H3_main {
	public static void main(String[] args) {
		
		int i = 120, j = 110, k = 3;
		k = -10;
		
		if (i>j) {
			if ( i <= 200) {
				if (j <= 100) {
					k = 1;
				}
			}
			if (i>200) {
				if (j<=100) {
					k = 2;
				}
				if (j>100) {
					k = 3;
				}
			}
		}
		if (i<j) {
			if (i<=200) {
				if (j<=100) {
					k = 4;
				}
			}
		}
		
		System.out.println("k = " + k);
		
		
	}

}
