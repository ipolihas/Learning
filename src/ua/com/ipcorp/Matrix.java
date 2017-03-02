package ua.com.ipcorp;

public class Matrix {
	public static void main(String[] args) {

		int i, j, k = 1, n=5;
		int a[][] = new int[5][5];

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				a[i][j] = k;
				k++;
				if (i == j | i + j == n-1) {
					if (k<10) {
					System.out.print(" *" + " ");
					} else {
						System.out.print(" *" + " ");
						}
				} else if (k<10){
					System.out.print(" " + a[i][j] + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println(" ");
		}
	}

}
