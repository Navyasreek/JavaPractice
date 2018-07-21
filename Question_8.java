package com.test;

public class Qus_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int A[] = new int[Integer.parseInt(args[0])];
		for (int i = 0; i < A.length; i++)
			A[i] = Integer.parseInt(args[i + 1]);
		for (int i : A) {
			System.out.print(i + " ");
		}
		// int A[] = { 8, 7, 3, 9, 6, 4, 2 };
		new Qus_8().solution(A);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insert Proper Values");
		}
	}

	public int solution(int[] A) {
		int min = A[0];
		for (int i = 0; i < A.length; i++) {
			if (min > A[i])
				min = A[i];
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (min == A[j]) {
					min++;
					j = A.length;
				}

			}
		}

		System.out.println("Min: "+min);
		return 0;
	}
}
