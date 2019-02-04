package com.loops;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		int y = 3;
		int z = 6;
		int maxNum = max(x, y, z);
		System.out.println(maxNum);

	}

	private static int max(int x, int y, int z) {
		// TODO Auto-generated method stub

		if ((x > y) && (x > z)) {
			return x;

		}
		if ((y > x) && (y > z)) {
			return y;
		}

		return z;

	}

}
