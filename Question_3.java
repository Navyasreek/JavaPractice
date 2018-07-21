package com.test;

public class Ques_3 {
	
	public static void main(String[] args) {
		
		
		//array123([1, 1, 2, 1, 2, 3]) → true
		int length_array = Integer.parseInt(args[0]);
		try {
			if (length_array == args.length- 1) {

				int arr[] = new int[Integer.parseInt(args[0])];
				Boolean flag = false;
				System.out.println("This is the given array:");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = Integer.parseInt(args[i + 1]);
				}

				for (int i = 0; i < arr.length && !flag; i++) {
					if (arr[i] == 1 && arr.length > i + 2) {
						if (arr[i + 1] == 2 && arri + 2] == 3)
							flag = true;
					}

				}
				if (flag)
					System.out.println(flag);
				else
					System.out.println(flag);
			} else {
				System.out.println("Insert Correct length array");
			}

		} catch (Exception e) {

			System.out.println("Insert Integer");
		}

	}

}
