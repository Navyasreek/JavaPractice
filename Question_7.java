package com.test;

public class Ques_7 {

	public static void main(String[] args) {
		boolean flag = false;
		int input[] = { 10000, 2, 3, 4, 5, 6 };
		for (int i : input) {
			if(i<1000 && i>-1000)
			{
				flag=true;
			}
			else {
				flag= false;
				break;
			}
		}
		if(flag)
		new Qus_7().Results(input, input.length, 3);
		else
		{
			System.out.println("Insert value in between -1000 to 1000");
		}
		
		
		
	}

	public void Results(int A[], int N, int K) {
		if(N<100 && K<100)
		{
			int start = K;
			int result_array[] = new int[N];
			for (int i = 0; i < A.length; i++) {

				result_array[start] = A[i];
				start++;

				if (start >= N)
					start = 0;
			}
			for (int i : result_array) {
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("Insert value 0 to 100 for N & K");
		}
		
	}
}
