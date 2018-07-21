package com.test;

public class Ques_4 {
// First argument for string and second for length
//	repeatFront("Chocolate", 4) → "ChocChoChC"
	public static void main(String args[]) {
		try {
			if(Integer.parseInt(args[1])<=args[0].length())
			{
			System.out.println(new Qus_4().repeatFront(args[0], Integer.parseInt(args[1])));
			}
			else {
				System.out.println("Insert valid length");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insert correct value");
		}
		
	}

	public String repeatFront(String name, int length) {
		String output = "";

		int len = length;
		for (int i = length; i > 0; i--) {
			output = output + name.substring(0, i);
		}

		return output;
	}
}
