package com.company;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Our array : " + Arrays.toString(array));

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println("Invert array : " + Arrays.toString(array));
	}
}