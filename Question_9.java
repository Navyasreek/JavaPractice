1package com.test;

public class Ques_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 1;
		try {
			for (int i = 1; i < args.length; i++) {
				if (Integer.parseInt(args[i]) == 0 || Integer.parseInt(args[i]) == 1) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				int A[] = new int[Integer.parseInt(args[0])];
				for (int i = 0; i < A.length; i++)
					A[i] = Integer.parseInt(args[i + 1]);
				for (int i : A) {
					System.out.print(i + " ");
				}
				// int A[] = { 8, 7, 3, 9, 6, 4, 2 };
				System.out.println("\nLength: "+ new Ques_9().solution(A));
			} else {

				System.out.println("Insert 0 or 1");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insert Proper Values");
		}

	}

	public int solution(int[] A) {
		int temp = A[0], Length_pairs = 0;
		for (int i = 0; i < A.length; i++) {
			if (temp == A[i]) {
				for (int j = i; j < A.length; j++) {
					if (temp != A[j]) {
						System.out.print("\nIndex:[" + i + "," + j + "]:"+"("+A[i]+","+A[j]+")");
						Length_pairs++;
					}

				}
			}
		}
		if(Length_pairs<100000)
		{
			Length_pairs=-1;
		}
		return Length_pairs;
	}

}
