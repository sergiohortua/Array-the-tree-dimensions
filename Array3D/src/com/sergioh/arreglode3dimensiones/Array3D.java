package com.sergioh.arreglode3dimensiones;

public class Array3D {

	public static void main(String[] args) {

		System.out.println("recorrido de un arreglo de 3 dimensiones");
		// recorrido de un arreglo de tres
		int[][][] array3 = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } },
				{ { 13, 14 }, { 15, 16 }, { 17, 18 } } };// inicializacion de arreglo de 3D 3x3x2=18 elementos
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {
					System.out.print(array3[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Con forech: ");

		for (int[][] is : array3) {
			for (int[] num : is) {
				for (int i : num) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

	}

}
