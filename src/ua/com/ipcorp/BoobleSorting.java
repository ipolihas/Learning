package ua.com.ipcorp;
public class BoobleSorting {
	public static void main(String[] args) {

		int[] array = { 30, 2, 10, 4, 6 };
		boolean sort = true;
		int i, k;
		// int j;
		int a = 0;
		//for (j=0;j<array.length-1;j++){
		while (sort) {
			sort = false;
			for (k = 0; k < (array.length - 1); k++) {
				if (array[k] > array[k + 1]) {
					a = array[k+1];
					array[k+1] = array[k];
					array[k] = a;
					sort = true;
				}

			}
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}